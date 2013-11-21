#!/bin/sh
java -jar plugins/org.eclipse.equinox.launcher_*.jar\
	-data workspace\
	-application org.openflexo.emfconnector.metamodel.exporter.application.dialog.application
