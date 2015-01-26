/**
 * 
 * Copyright (c) 2013, Openflexo
 * 
 * This file is part of ./org.openflexo.emfconnector.metamodel.exporter.application.headless/src/org/openflexo/emfconnector/metamodel/exporter/application/headless/FileLogListener.java, a component of the software infrastructure 
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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.core.runtime.ILogListener;
import org.eclipse.core.runtime.IStatus;

public class FileLogListener implements ILogListener
{
  protected final String folderpath;
  protected final int severityMask;
  protected PrintStream logStream = null;

  public FileLogListener(String folderpath, int severityMask)
  {
    this.folderpath = folderpath;
    this.severityMask = severityMask;
  }

  public void init()
  {
    File logFolder = new File(folderpath);
    if (!logFolder.exists())
    {
      logFolder.mkdirs();
    }
    File logFile = new File(logFolder.getAbsolutePath() + File.separator + "log-" + System.currentTimeMillis() + ".log");
    try
    {
      logFile.createNewFile();
      logStream = new PrintStream(logFile);
      System.setOut(logStream);
      System.setErr(logStream);
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }

  public void finish()
  {
    if (logStream != null)
    {
      logStream.close();
      logStream = null;
    }
  }

  public void logging(IStatus status, String plugin)
  {
    if (status.matches(severityMask))
    {
      logStream.append(plugin + " : " + status.getMessage());
    }
  }
}
