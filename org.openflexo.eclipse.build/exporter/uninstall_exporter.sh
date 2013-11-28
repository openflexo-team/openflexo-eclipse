#!/bin/sh
rm -rf director
unzip *director*.zip
cd director
java -jar plugins/org.eclipse.equinox.launcher_*.jar\
	-data workspace\
	-application org.eclipse.equinox.p2.director\
	-destination $1\
	-profileProperties org.eclipse.update.install.features=true\
	-uninstallIU org.openflexo.emfconnector.metamodel.exporter.updatesite.feature.feature.group
cd -
rm -rf director
