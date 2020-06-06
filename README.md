# kotlin
```bash
mvn archetype:generate \
    -DarchetypeGroupId=org.jetbrains.kotlin \
    -DarchetypeArtifactId=kotlin-archetype-jvm \
    -DarchetypeVersion=1.3.72 \
    -DgroupId=com.gmaurizio.calculator \
    -DartifactId=calculator \
    -Dversion=1.0.0-SNAPSHOT \
    -Dpackage=com.gmaurizio.calculator \
    -DprojectName=calculator \
    '-DorganizationName=Gustavo Maurizio Ltd.' \
    -DcopyrightStartYear=2020 \
    '-DdockerImageName=calculator'
