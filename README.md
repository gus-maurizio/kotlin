# kotlin
```bash
mvn archetype:generate \
    -DarchetypeGroupId=org.jetbrains.kotlin \
    -DarchetypeArtifactId=kotlin-archetype-jvm \
    -DarchetypeVersion=1.3.72 \
    -DgroupId=com.gmaurizio.kotlin \
    -DartifactId=calculator \
    -Dversion=1.0.0 \
    -Dpackage=com.gmaurizio.calculator \
    -DprojectName=calculator \
    -DcopyrightStartYear=2020 \
    '-DorganizationName=Gustavo Maurizio Ltd.' \
    '-DdockerImageName=calculator' \
    -DinteractiveMode=false

mvn clean package
mvn exec:java -Dexec.mainClass="com.gmaurizio.calculator.HelloKt"
mvn exec:java

java -jar ./target/calculator-1.0.0-jar-with-dependencies.jar

```