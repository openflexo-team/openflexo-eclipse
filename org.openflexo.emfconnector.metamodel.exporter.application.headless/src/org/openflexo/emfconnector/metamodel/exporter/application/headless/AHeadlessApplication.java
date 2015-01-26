/**
 * 
 * Copyright (c) 2013, Openflexo
 * 
 * This file is part of ./org.openflexo.emfconnector.metamodel.exporter.application.headless/src/org/openflexo/emfconnector/metamodel/exporter/application/headless/AHeadlessApplication.java, a component of the software infrastructure 
 * developed at Openflexo.
 * 
 * 
 * Openflexo is dual-licensed under the European Union Public License (EUPL, either 
 * version 1.1 of the License, or any later version ), which is available at 
 * https://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 * and the GNU General Public License (GPL, either version 3 of the License, or any 
 * later version), which is available at http://www.gnu.org/licenses/gpl.html .
 * 
 * You can redistribute it and/or modify under the terms of either of these licenses
 * 
 * If you choose to redistribute it and/or modify under the terms of the GNU GPL, you
 * must include the following additional permission.
 *
 *          Additional permission under GNU GPL version 3 section 7
 *
 *          If you modify this Program, or any covered work, by linking or 
 *          combining it with software containing parts covered by the terms 
 *          of EPL 1.0, the licensors of this Program grant you additional permission
 *          to convey the resulting work. * 
 * 
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE. 
 *
 * See http://www.openflexo.org/license.html for details.
 * 
 * 
 * Please contact Openflexo (openflexo-contacts@openflexo.org)
 * or visit www.openflexo.org if you need additional information.
 * 
 */

package org.openflexo.emfconnector.metamodel.exporter.application.headless;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.osgi.service.datalocation.Location;
import org.eclipse.osgi.util.NLS;

public abstract class AHeadlessApplication extends AApplication
{
  protected static final String PARAMETER_PREFIX = "--";
  protected static final String CONFIGURATION = "configuration";
  protected static final String HELP = "help";
  protected static final String LOG = "log";

  protected static final String LOG_LEVEL_MASK = LOG + ".level";
  protected static final String LEVEL_OK = "OK";
  protected static final String LEVEL_INFO = "INFO";
  protected static final String LEVEL_WARNING = "WARNING";
  protected static final String LEVEL_ERROR = "ERROR";
  protected static final String LEVEL_CANCEL = "CANCEL";

  protected String[][] arguments = null;
  protected Properties properties = new Properties();
  protected FileLogListener logListener = null;

  public AHeadlessApplication(String application)
  {
    super(application);
  }

  @Override
  protected void customStart()
  {
    arguments = parseArguments();

    if (!checkUse(arguments))
    {
      StringBuilder builder = new StringBuilder();
      printUse(builder);
      System.out.println(builder.toString());
    }
    else
    {
      initialiseLog();
      run(arguments, properties);
      closeLog();
    }
  }

  protected String[] getArgument(String[][] arguments, String name)
  {
    String[] argument = null;
    for (int i = 0; i < arguments.length && argument == null; i++)
    {
      String[] currentArgument = arguments[i];
      if (currentArgument[0].equals(PARAMETER_PREFIX + name))
      {
        argument = currentArgument;
      }
    }
    return argument;
  }

  protected String[][] parseArguments()
  {
    String[][] arguments = null;
    String[] args = (String[]) (context.getArguments().get(IApplicationContext.APPLICATION_ARGS));
    arguments = new String[args.length][];
    for (int i = 0; i < args.length; i++)
    {
      String[] splitedArgument = args[i].split("=");

      arguments[i] = new String[splitedArgument.length];
      for (int j = 0; j < splitedArgument.length; j++)
      {
        arguments[i][j] = splitedArgument[j];
      }
    }
    return arguments;
  }

  protected boolean checkUse(String[][] arguments)
  {
    boolean result = true;
    result &= checkArguments(arguments);
    return result;
  }

  protected boolean checkArguments(String[][] arguments)
  {
    boolean result = true;
    result &= checkPrintUseArgument(arguments);
    result &= checkConfigurationPropertyFileArgument(arguments);
    return result;
  }

  protected boolean checkPrintUseArgument(String[][] arguments)
  {
    boolean result = true;
    String[] printUse = getArgument(arguments, HELP);
    if (printUse != null)
    {
      result = false;
    }
    return result;
  }

  protected boolean checkConfigurationPropertyFileArgument(String[][] arguments)
  {
    boolean result = true;
    String[] config = getArgument(arguments, CONFIGURATION);
    if (config == null || config.length != 2)
    {
      result = false;
    }
    else
    {
      File file = new File(config[1]);
      if (file.exists())
      {
        loadProperties(file);
        result = result && checkConfigurationPropertyFileContent();
      }
      else
      {
        result = false;
        System.out.println(NLS.bind("Configuration file {0} doesn't exist.", new String[] { config[1] }));
      }
    }

    return result;
  }

  protected boolean checkConfigurationPropertyFileContent()
  {
    boolean result = true;
    result = result && checkFolder(LOG, true, false);
    return result;
  }

  protected boolean checkBoolean(String property, boolean optional)
  {
    final boolean result;
    if (properties.containsKey(property))
    {
      String value = properties.getProperty(property);
      if (value != null)
      {
        boolean check = value.equalsIgnoreCase(Boolean.toString(Boolean.TRUE))
            || value.equalsIgnoreCase(Boolean.toString(Boolean.FALSE));
        if (check)
        {
          result = true;
        }
        else
        {
          result = false;
          System.out.println(NLS.bind("Property {0} value {1} is not allowed (true/false).", new String[] { property,
              value }));
        }
      }
      else
      {
        result = true;
      }
    }
    else
    {
      if (optional)
      {
        result = true;
      }
      else
      {
        result = false;
        System.out.println(NLS.bind("Property {0} not set.", new String[] { property }));
      }
    }
    return result;
  }

  protected boolean checkFile(String property, boolean optional, boolean mustExist)
  {
    final boolean result;
    if (properties.containsKey(property))
    {
      String filepath = properties.getProperty(property);
      if (filepath != null)
      {
        File file = new File(filepath);
        if (mustExist)
        {
          if (file.exists())
          {
            if (file.isFile())
            {
              result = true;
            }
            else
            {
              result = false;
              System.out.println(NLS.bind("Property {0} set, but {1} is not a file.",
                                          new String[] { property, filepath }));
            }
          }
          else
          {
            result = false;
            System.out.println(NLS
                .bind("Property {0} set, but {1} doesn't exist.", new String[] { property, filepath }));
          }
        }
        else
        {
          result = true;
        }
      }
      else
      {
        result = false;
        System.out.println(NLS.bind("Property {0} set, but file is not set.", new String[] { property }));
      }
    }
    else
    {
      if (optional)
      {
        result = true;
      }
      else
      {
        result = false;
        System.out.println(NLS.bind("Property {0} not set.", new String[] { property }));
      }
    }
    return result;
  }

  protected boolean checkFolder(String property, boolean optional, boolean mustExist)
  {
    final boolean result;
    if (properties.containsKey(property))
    {
      String filepath = properties.getProperty(property);
      if (filepath != null)
      {
        File file = new File(filepath);
        if (mustExist)
        {
          if (file.exists())
          {
            if (file.isDirectory())
            {
              result = true;
            }
            else
            {
              result = false;
              System.out.println(NLS.bind("Property {0} set, but {1} is not a folder.", new String[] { property,
                  filepath }));
            }
          }
          else
          {
            result = false;
            System.out.println(NLS.bind("Property {0} set, but folder {1} doesn't exist.", new String[] { property,
                filepath }));
          }
        }
        else
        {
          result = true;
        }
      }
      else
      {
        result = false;
        System.out.println(NLS.bind("Property {0} set, but folder not set.", new String[] { property }));
      }
    }
    else
    {
      if (optional)
      {
        result = true;
      }
      else
      {
        result = false;
        System.out.println(NLS.bind("Property {0} not set.", new String[] { property }));
      }
    }
    return result;
  }

  protected void printUse(StringBuilder builder)
  {
    printCommandLineUse(builder);
    builder.append("\n");
    printConfigurationPropertyFileUse(builder);
  }

  protected void printCommandLineUse(StringBuilder builder)
  {
    builder.append("############################################\n");
    builder.append("############### Command Line ###############\n");
    builder.append("############################################\n");
    builder.append("java -jar plugins/org.eclipse.equinox.launcher_<version>.jar -application " + application + "\n");
    builder.append(PARAMETER_PREFIX + HELP + " : Display this message (All actions are inhibited)\n");
    builder.append(PARAMETER_PREFIX + CONFIGURATION + "='Path' : File to configure application\n");
  }

  protected void printConfigurationPropertyFileUse(StringBuilder builder)
  {
    builder.append("##########################################################\n");
    builder.append("############### Configuration file content ###############\n");
    builder.append("##########################################################\n");
    builder.append("#---------> Log <---------\n");
    builder.append(LOG + " = 'Path' : Log directory path\n");
    builder.append(LOG_LEVEL_MASK + " = " + LEVEL_OK + "," + LEVEL_INFO + "," + LEVEL_WARNING + "," + LEVEL_ERROR + ","
        + LEVEL_CANCEL + " : Comma separated value of log level mask\n");
  }

  protected void loadProperties(File configuration)
  {
    try
    {
      properties.load(new FileInputStream(configuration));
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }

  protected abstract void run(String[][] arguments, Properties properties);

  protected void initialiseLog()
  {
    String log = null;
    if (properties.containsKey(LOG))
    {
      log = properties.getProperty(LOG);
    }
    else
    {
      try
      {
        Location instanceLocation = Platform.getInstanceLocation();
        URL instanceUrl = instanceLocation.getURL();
        File instanceFile = new File(instanceUrl.toURI());
        log = instanceFile.getAbsolutePath();
      }
      catch (URISyntaxException e)
      {
        log = ".";
      }
    }

    int severityMask = IStatus.OK | IStatus.INFO | IStatus.WARNING | IStatus.ERROR | IStatus.CANCEL;
    if (properties.containsKey(LOG_LEVEL_MASK))
    {
      String logMask = properties.getProperty(LOG_LEVEL_MASK);
      severityMask = getLogSeverityMask(logMask);
    }

    logListener = new FileLogListener(log, severityMask);
    logListener.init();
    Platform.addLogListener(logListener);
  }

  protected void closeLog()
  {
    if (logListener != null)
    {
      logListener.finish();
      Platform.removeLogListener(logListener);
      logListener = null;
    }
  }

  protected int getLogSeverityMask(String severityMaskString)
  {
    int severityMask = 0;
    String[] severities = severityMaskString.split(",");

    for (String severity : severities)
    {
      if (severity.equalsIgnoreCase(LEVEL_OK))
      {
        severityMask |= IStatus.OK;
      }
      else if (severity.equalsIgnoreCase(LEVEL_INFO))
      {
        severityMask |= IStatus.INFO;
      }
      else if (severity.equalsIgnoreCase(LEVEL_WARNING))
      {
        severityMask |= IStatus.WARNING;
      }
      else if (severity.equalsIgnoreCase(LEVEL_ERROR))
      {
        severityMask |= IStatus.ERROR;
      }
      else if (severity.equalsIgnoreCase(LEVEL_CANCEL))
      {
        severityMask |= IStatus.CANCEL;
      }
      else
      {
        // FIXME Unknown log severity mask
      }
    }
    return severityMask;
  }
}
