# Java Project Demo with Maven
## Development
1. Create project:  mvn archetype:generate -DgroupId=com.example.demo -DartifactId=maven-demo -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
2. Build: mvn compile
3. Run: mvn exec:java -Dexec.mainClass="com.example.demo.App"

## Deployment
1. Copy this configuration to `pom.xml`
<build>
      <plugins>
          <plugin>
              <groupId>org.apache.maven.plugins</groupId>
              <artifactId>maven-jar-plugin</artifactId>
              <version>3.2.0</version>
              <configuration>
                  <archive>
                      <manifest>
                          <addClasspath>true</addClasspath>
                          <mainClass>com.example.demo.App</mainClass>
                      </manifest>
                  </archive>
              </configuration>
          </plugin>
      </plugins>
  </build>
2. Package: mvn package
3. Test the file `.jar` in `target` directory: java -jar target/abc.jar
4. Now you can run this jar file to any machine which has the same version of JRE: java -jar <your_path_to_jar_file>