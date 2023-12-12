# SAP Commerce 123 Project

SAP Commerce 123 Project from SAP

[for steps](https://help.sap.com/docs/SAP_COMMERCE/3fb5dcdfe37f40edbac7098ed40442c0/a1ef894ac89545e79c470c726b487d13.html)

## Prerequisites
You require the following to use SAP Commerce 123:

- Java 17 Software Development Kit
- Apache Maven
- Git
- Chrome web browser


## Installation

Go to this link [softwareCenter](https://me.sap.com/softwarecenter/search/SAP%2520Commerce) to install sap zip.

## Steps
- go to this path SAP Commerce → Installation Product -> SAP Commerce Cloud 2205 -> CXCOMM220500P_17-80006942.ZIP
- download zip
- create a new folder with project name & go to folder path
- then unzip CXCOMM.zip to this folder with this command
```bash
unzip CXCOMM220500P_X-XXXXXXXX.zip -d CXCOMM220500P_X-XXXXXXXX
```
- lanuch SAP Commerce 123 with command
```bash
java -jar target/hybris123.war
```
- then open the SAP Commerce 123 Interactive on browser from [this link](http://localhost:8080)

## Install SAP Commerce 123 Interactive
- 1- Go to SAP Note [hybris123](https://me.sap.com/notes/2575447) -> attachments & download hybris123.zip 
 - Information published on SAP site and download its attachment hybris123.zip (SAP Commerce 123 Interactive) into the <HYBRIS_HOME_DIR> folder, and unzip 
```bash
unzip hybris123.zip
```
- 2- Download the [images](https://help.sap.com/doc/44bd59b3e0fb4a9aa05a3cb787090a1c/6.0.0.0/en-US/images.zip) ZIP into <HYBRIS_HOME_DIR>/hybris123/src/main/webapp and unzip it.
```bash
unzip images.zip
```
- 3- Create the WAR file 
```bash
cd $HYBRIS_HOME_DIR/hybris123; mvn clean package -DskipTests
```
- 4- Launch SAP Commerce 123.
```bash
cd $HYBRIS_HOME_DIR/hybris123; java -jar target/hybris123.war
```
- 5- Open SAP Commerce 123 Interactive in your Chrome browser at http://localhost:8080

## Install, Build, and Run Accelerator
Install, build, and run Accelerator so that you can explore the storefront and Backoffice Administration Cockpit.

### Procedure
- 1- Navigate to <HYBRIS_HOME_DIR>/installer and install, build, and run SAP Commerce with the B2B Accelerator recipe.
Once startup is complete, you should see Server startup in xxxxxx ms in the console output. This may take a while.

```bash
cd $HYBRIS_HOME_DIR/installer; ./install.sh -r cx setup -A local_property:initialpassword.admin=admin
```
```bash
./install.sh -r cx initialize -A local_property:initialpassword.admin=admin
```
```bash
./install.sh -r cx start
```
- 2- Wait for the server to start and then access the storefront at https://localhost:9002/yb2bacceleratorstorefront/powertools/en/USD/login
This may take a while.
- 3- Log in to the Backoffice at https://localhost:9002/backoffice using the default login (admin) and the password that you defined as an environment variable. Here you can configure your storefront settings.
- 4- Run the acceptance test testAcceleratorQuickDiveIsOk and confirm that it now passes
```bash
cd $HYBRIS_HOME_DIR/hybris123; mvn -Dtest=com.hybris.hybris123.runtime.tests.Hybris123Tests#testAcceleratorQuickDiveIsOk test
```
### Result
Congratulations! You have completed the tour. You now know how to use an installer recipe to create an SAP Commerce Accelerator storefront, which you can manage through Backoffice.

