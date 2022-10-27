### ALPIAN TECHNICAL TASK



### Steps to Create Project
1.Create a maven project called `AlpianTechnicalTest`
2. Under `pom.xml`
    1. add below dependencies section

```
<dependencies>

        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.141.59</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.2.0</version>
        </dependency>


        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>7.3.4</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>7.3.4</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>me.jvt.cucumber</groupId>
            <artifactId>reporting-plugin</artifactId>
            <version>7.3.0</version>
        </dependency>

    </dependencies>


```

3.Create a package called `com` under `src/test/java`
1. under com create `alpian` packages and under alpian create `pages`
packages
2. create a called `runners` packages, under alpian packages
3. create a called `stepDefinitions` packages, under alpian packages
4. create a called `utilities` packages, under alpian packages
5. Create a package called `resources` under `src/test` package
6. Create a package calles `features` under resources folder 

4.Create file `computerDatabase.feature` under features file. 
Start to write all scenario included positive and negative scenarios.
Used `tag` to run scenarios and codes.

5.Implement all codes under the stepDefinitions package in `ComputerDatabaseStepDef` class.
Get all snippets and write your codes. And also write your 

6.Under the pages 
