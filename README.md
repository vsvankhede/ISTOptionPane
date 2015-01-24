# ISTOptionPane

This library is for good look &amp; feel for JOptionPane.
* easy to use
* Eye catching ui

To use this library first download .jar files from jar folder.
Then import this jar file to your project.

To set title and the question in ISTOptionPane
Use following code 
```java
ist.displaypane("Title","Question")
```
ex:
```java 
ist.displaypane("Conformation", "Do you want to save this?")
```
![alt tag](https://github.com/vsvankhede/ISTOptionPane/blob/master/build/Capture.JPG)


To get user action
Use following code
```java
ist.getState();
```
* It will return default false;
* If user click on yes button then it will reply true.
