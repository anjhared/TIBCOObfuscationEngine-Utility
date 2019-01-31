# TIBCOObfuscationEngine-Utility
This is a tool which has the purpose to allow decryption/deobfuscation of TIBCO BW 5.x encrypted/obfuscated strings. In addition, you can use this tool to encrypt/obfuscate readable passwords. The tool also works with TIBCO BW 6.x!!

**DISCLAIMER:** You will not find any proprietary TIBCO software in this repository. In order to use this tool you will need to have TIBCO BW 5.x and/or TIBCO BW 6.x already installed in your machine. This is only a helpful tool to get around the blocker of a forgotten or unknown password.

## Installation Instructions

### Prerequisites

Must have TIBCO BW 5.x/6.x and Java 6 or higher installed.

### Installation

Please follow these instructions to install ObfuscationEngineMethods:

1. Choose any directory in your Windows system where to install this tool and take note of it.

2. Place the *ObfuscationEngineMethods.txt*, *ObfuscationEngineMethodCalls.java* and *ObfuscationEngineMethodCalls.class* files from this folder and place them in the directory chosen in step **1**.
    
3. Open the *ObfuscationEngineMethods.txt* with any text editor and modify lines **61**, **63**, **65** and **67**.
   - In line **61** provide the directory of your *C:\...\Java\...\bin* in the variable JAVA_DIR. If you have JDK installed provide its directory, if you only have JRE installed then provide its directory. (eg. *C:\Program Files\Java\jdk1.6.0_45\bin*)
   - In line **63** provide the directory of your TIBCO_HOME (eg. *C:\tibco*) in the variable TIBCO_DIR.
   - In line **65** provide the TIBCO version (TRA version) (eg. 5.9) in the variable TIB_VER.
   - In line **67** provide the directory chosen in step **1** in the variable JAVA_CLASS_DIR.
   - **NOTE:** The *ObfuscationEngineMethodCalls.class* included in this repository was compiled with Java 6. If you want to compile the class with a higher Java version you can omit copying this file at all, but you will need to have JDK installed and provide its bin location in the JAVA_DIR variable at line **63**. Then upon the first run, the tool will automatically compile a new class with *javac*.
   
4. Save your changes of *ObfuscationEngineMethods.txt* then save again but change extension from *“.txt”* to *“.cmd”* (eg. *ObfuscationEngineMethods.cmd*)
   
5. You now should have 4 files in your chosen directory (*ObfuscationEngineMethods.cmd*, *ObfuscationEngineMethods.txt*, *ObfuscationEngineMethodCalls.java* and *ObfuscationEngineMethodCalls.class*).
   
6. You can make a shortcut of *ObfuscationEngineMethods.cmd* in your Desktop for easy access.

7. Execute *ObfuscationEngineMethods.cmd* and enjoy!

## Screenshots

### Main Menu

![Main Menu Screen](https://github.com/anjhared/TIBCOObfuscationEngine-Utility/blob/master/screenshots/menu.JPG)

### Decrypt Password

![Decrypt Password Screen](https://github.com/anjhared/TIBCOObfuscationEngine-Utility/blob/master/screenshots/decrypt.JPG)
