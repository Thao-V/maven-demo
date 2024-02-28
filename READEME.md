# Create Java Project Demo
## Maven
1. Create project:  mvn archetype:generate -DgroupId=com.example.demo -DartifactId=maven-demo -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
2. Build: maven compile
3. Run: mvn exec:java -Dexec.mainClass="com.example.demo.App"
## gradle
1. Create project: gradle init --type java-application
2. Build: ./gradlew build
3. Run: ./gradlew run