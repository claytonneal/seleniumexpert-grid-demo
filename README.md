## Selenium Grid Presentation ##
This repository contains sample code for the TACO Selenium Grid presentation

#### Building ####
The example code uses library : https://github.com/FlexTradeUKLtd/jfixture
This library wasn't on ECD maven repository at time of writing, so maven settings need to be changed to use maven central. 

#### Executing ####

I use the TestNG plugin to Eclipse to execute the test cases via run configurations
The environment variables needed for execution are:

 - BROWSER_LOCATION : Specifies where the browser will be launched
 - BROWSER_NAME : Specifies the name of the browser to use
 - BROWSER_OS : Specifies the operating system of the browser
 - BROWSER_VERSION : Specifies the version of the browser to use

#### Local Execution ####

    BROWSER_LOCATION=Local

A local browser will be launched. The settings BROWSER_OS, BROWSER_VERSION are therefore not needed to be specified.

#### SauceLabs Execution ####

    BROWSER_LOCATION=SauceLabs

A browser will be launched in SauceLabs, using the Name, OS and Version settings of the browser.

#### Configuration ####
The properties file : **SeleniumGrid.properties** specifies the following:

    local.geckodriver.location : Path to gecko driver executable
    localgrid.huburl : URL of Grid hub when using a locally hosted grid
    saucelabs.username : User account on saucelabs
    saucelabs.accesskey : Account access key on saucelabs
    saucelabs.huburl : Grid hub url on saucelabs
    
The properties file **SeleniumTimings.properties** specifies the timeouts to use with selenium, for each browser location

    <location>.pageload : The default selenium page load timeout in seconds
    <location>.scripttimeout : The default selenium js timeout in seconds
    <location>.elementlocation : The default timeout to use to locate an element in seconds
    
Note that the *ImplicitWait* setting in Selenium is set to 500ms.

#### Selenium Version ####
The project used Selenium v2.52.0. This is because selenium v3.0.0 is newly released, but as yet unsupported in SauceLabs

#### Sample WebSite ####
The tests within the project are aimed at sample website: 
http://grid-tools-downloads.com/testpages/form2.html


