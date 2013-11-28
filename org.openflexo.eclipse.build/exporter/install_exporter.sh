#!/bin/sh
rm -rf director
rm -rf updatesite-org.openflexo.emfconnector.metamodel.exporter
unzip *director*.zip
unzip *exporter*.zip -d updatesite-org.openflexo.emfconnector.metamodel.exporter
cd director
java -jar plugins/org.eclipse.equinox.launcher_*.jar\
	-data workspace\
	-application org.eclipse.equinox.p2.director\
	-destination $1\
	-repository file://`pwd`/../updatesite-org.openflexo.emfconnector.metamodel.exporter/,http://download.eclipse.org/modeling/emf/emf/updates/releases/\
	-profileProperties org.eclipse.update.install.features=true\
	-installIU org.openflexo.emfconnector.metamodel.exporter.updatesite.feature.feature.group
cd -
rm -rf director
rm -rf updatesite-org.openflexo.emfconnector.metamodel.exporter
