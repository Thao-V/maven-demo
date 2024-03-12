# Java Project Demo with Maven
1. Create project:  mvn archetype:generate -DgroupId=com.example.demo -DartifactId=maven-demo -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
2. Build: mvn compile
3. Run: mvn exec:java -Dexec.mainClass="com.example.demo.App"