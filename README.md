# MavenJDK15EclipseStarter

use Eclipse version 2020-12

use default jdk 15 that comes with eclipse

use custom settings.xml for proxy

use repository folder for project related jars

First create a java project and check if the hello world runs properly by rt click 

Create Maven project 

pom.xml > Maven > Update Project ( Select Force )

Maven build > add "package" as goal

Maven clean

Maven build


----
For bitbucket projects add proxy to Eclipse so that Maven can still work and add bitbucket hostname to 
Eclipse > Preferences > Network Connections > Proxy Bypass list

For the default maven version on this Eclipse version , projects with JDK 1.7 needs to be upgraded to JDK 8 for maven to work properly

For JDK 8 projects always use JDK instead of JRE, and also select the same in 
Eclipse > Preferences > Java > Installed JREs > Execution Environment > JavaSE 1.8 -> Compatible JREs

After changing the pom.xml ---> need to update the Maven project using rt click on pom xml > Maven > Update Project > select Force update > Run
Then you have to Clean and Build

Basel NBS proxy works better than Cambridge NBS proxy
