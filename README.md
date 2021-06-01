### Dependencies
There are several prerequisite dependencies you should install on your machine prior to starting to work:

* [Java 8](https://www.oracle.com/in/java/technologies/javase/javase-jdk8-downloads.html)

* An IDE to write your tests on - [Eclipse](http://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/marsr) or [IntelliJ](https://www.jetbrains.com/idea/download/#)

* [Maven](https://maven.apache.org/) (Optional - Needed only for command line executions as IDEs have Maven in-built.)

* Download the necessary app files from [here](https://github.com/PerfectoMobileSA/PerfectoJavaSample/tree/master/libs), upload it to your Perfecto Media Repository and configure that locator path to driver.capabilities.app capability in your testng xml file.

Eclipse users should also install:

1. Eclipse has in-built Maven plugin 
    - Optional - [Maven Plugin](http://marketplace.eclipse.org/content/m2e-connector-maven-dependency-plugin)

2. [TestNG Plugin](http://testng.org/doc/download.html)

3. QAF BDD Plugin - Or go to install new software option in eclipse, and download from this url https://qmetry.github.io/qaf/editor/bdd/eclipse/
    In case, of network constraints, one can follow the instruction mentioned in [QAF BDD Offline](https://developers.perfectomobile.com/display/PD/Quantum+framework+introduction#expand-InstallanofflineversionoftheQAFBDDplugininEclipse)

IntelliJ IDEA users should also install:

1. [Cucumber Plugin (Community version only)](https://plugins.jetbrains.com/plugin/7212)
    - In case after installing the above plugin you are still not able to navigate to the step definition code then install this plugin -               [Cucumber for Groovy Plugin](https://plugins.jetbrains.com/plugin/7213-cucumber-for-groovy)

TestNG Plugin is built-in in the IntelliJ IDEA, from version 7 onwards.
 
#### Optional Installations
* For source control management, you can install [git](https://git-scm.com/downloads).

### Object Repository creation guidelines
1. Copy-Paste your test to the _.loc_ file.
2. Remove lines unrelated to objects. 
3. From each object related line, create a line formatted as <br>`objectname = locatortype=objectlocator`<br>For example <br>`edit.start = xpath=//*[@label="Start location"]`

### Testng guidelines

1. Under the _config/_ folder, open the _testng_appium.xml_ or _testng_web.xml_ file, depending on your app type.
2. Copy the first test suite, and verify it's the only one with a **true** _enabled_ property, to prevent the other test suites from running in parallel.
3. Copy your feature/scenario tag to the _name_ property in the _include_ clause. Use a space-separated tags' list to include more scenarios and features.
4. Add a parameter specifying the type of device, or naming a specific one, to be used for your test execution, for example, <br>`<parameter name="driver.capabilities.model" value="iPhone.*"></parameter>`


## Parallel execution
To run all samples in parallel, you need to configure the _TestNG.xml_ file, which is located under the _src/test/resources/config/_ folder.

1. For each of the test suites (enclosed within <test>...</test>), set the _enabled_ property value to **_true_**.
2. Run your test as before.

This results in running 2 additional samples, both searching terms in Perfecto Community; one uses hard coded search terms, and the other retrieves them from an external input file.

## Diversifying test execution
You can set each of the test suites to run on a different type of device, and to include different scenarios. For that, you need to manipulate the contents of the various test suites in the _TestNG.xml_ file.
Modify **only** the test suites not related to the Google sample we started with.

1. Replace the current tag in the community samples, so that in the _CommunityExample.feature_ sample all tags are **@sampletag**, and in the _CommunityDataDrivenExample.feature_ sample - **@sampletagdd**. <br>You may of course use other values, or leave the tags as is, but use these tag values for demonstration's sake.
2. In the _TestNG.xml_ file, set the tag parameter value in one suite to **@sampletag**, and in the other - to **@sampletagdd**.<br>That means, that the first test suite runs the CommunityExample sample, and the second - the CommunityDataDrivenExample sample.
3. To vary the devices used for each of the test suites, replace the capability parameter ("driver.capabilities.someCapability") in both suites with<br>`<parameter name="driver.capabilities.platformName" value="Android"/>`.<br>Set the value to "iOS" in the second test suite.<br>By that, you specify that the CommunityExample sample will run on an Android device (randomly allocated), and the CommunityDataDrivenExample sample - on an iOS device.<br>**Note:** Generally, you can use any of the numerous device selection capabilities.
4. Run your test in the same manner as before.<br>You can follow your test execution on Perfecto Dashboard and see the three samples running on the specified device types.

## Viewing test execution results in dashboard.htm

All the previous executions were recorded, and may be viewed in dashboard.htm
