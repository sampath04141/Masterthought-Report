
#Run command

mvn clean verify

#Important dependencies  
------------------------------
<!-- https://mvnrepository.com/artifact/net.masterthought/cucumber-reporting -->
        <dependency>
            <groupId>net.masterthought</groupId>
            <artifactId>cucumber-reporting</artifactId>
            <version>5.3.0</version>
        </dependency>
        

#compiler and surefire plugin is required[refer the project]
-------------------------------------------
            <plugin>
                <groupId>net.masterthought</groupId>
                <artifactId>maven-cucumber-reporting</artifactId>
                <version>5.3.0</version>
                <executions>
                    <execution>
                        <id>execution</id>
                        <phase>verify</phase>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                        <configuration>
                            <projectName>cucumber-jvm-example</projectName>
                            <!-- optional, per documentation set this to "true" to bypass generation of Cucumber Reports entirely, defaults to false if not specified -->
                            <skip>false</skip>
                            <!-- output directory for the generated report -->
                            <outputDirectory>${project.build.directory}/jsonOutput</outputDirectory>
                            <!-- optional, defaults to outputDirectory if not specified -->
                            <inputDirectory>${project.build.directory}/jsonOutput</inputDirectory>
                            <jsonFiles>
                                <!-- supports wildcard or name pattern -->
                                <param>**/*.json</param>
                            </jsonFiles>
                            <!-- optional, defaults to outputDirectory if not specified -->
                            <classificationDirectory>${project.build.directory}/jsonOutput</classificationDirectory>
                            <classificationFiles>
                                <!-- supports wildcard or name pattern -->
                                <param>sample.properties</param>
                                <param>other.properties</param>
                            </classificationFiles>
                            <!-- optional, set true to group features by its Ids -->
                            <mergeFeaturesById>false</mergeFeaturesById>
                            <!-- optional, set true to get a final report with latest results of the same test from different test runs -->
                            <mergeFeaturesWithRetest>false</mergeFeaturesWithRetest>
                            <!-- optional, set true to fail build on test failures -->
                            <checkBuildResult>false</checkBuildResult>
                        </configuration>
                    </execution>
                </executions>
            </plugin>


