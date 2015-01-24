# ISTOptionPane
This library is for good look &amp; feel for JOptionPane.
* easy to use
* Eye catching ui

To set title and the question in ISTOptionPane
Use following code 
```java
ist.displaypane("Title","Question")
```
ex:
```java 
ist.displaypane("Conformation", "Do you want to save this?")
```

To get user action
Use following code
```java
ist.getState();
```
* It will return default false;
* If user click on yes button then it will reply true.
