#!/bin/sh
cd $1
java -jar plugins/org.eclipse.equinox.launcher_*.jar\
	-data workspace\
	-application org.openflexo.emfconnector.metamodel.exporter.application.dialog.application
cd -
