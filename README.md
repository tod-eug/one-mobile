Autotests for Android application.

Before run test you should run appium with default parameters and Android virtual device.
Tests was developing with Nexus 6 and Android 9.  
 - Parameters can be changed in environment.propreties
 - Capabilities can be changed in capabilities.propreties

Technologies: Java + JUnit + Appium + Selenide + Allure

Tests can be run with Itellij Idea or with command line:
 - Idea: go to the src/test/java/FollowingPageTests and run it
 - Command line: gradlew.bat test --tests FollowingPageTests

Creating Allure report:
 - Idea: go to the build.gradle and run task "generateAllure"
 - Command line: gradlew.bat generateAllure
    
    
Allure report will be in build/reports/allure/index.html    