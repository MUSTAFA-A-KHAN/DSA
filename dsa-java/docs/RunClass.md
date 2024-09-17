# Run Java Code from the Terminal

## Without ***Package***

### ***Step 1 :***    Go to the directory where your source code is.
### ***Step 2 :*** compile Java code using the terminal 
````
  $ javac file_name_with_the_extension
 ````
***Example:***
```
  $ cd src/main/java/mustafakhan/uk/to
  $ javac App.java
 ```
### ***Step 3 :*** Run the Java Code
```
 $ java class_file_name_without_the_extension
```
***Example***
``` 
 $ java App
```
## With ***Package***
### ***Step 1 :***    Go to the directory where your source code is.
### ***Step 2 :*** compile Java code using the terminal 
```
 $ javac -d . file_name_with_the_extension
```
***Example:***
```
 $  cd src/main/java/mustafakhan/uk/to
 $  javac -d . App.java
 ```
 ***this will compile the into .class file inside the folder according to package***
 
 - if you input ```.``` this will be created at the same folder from where you run the command.  

### ***Step 3 :*** Run the Java Code
```
$ java directory_of_the_class_file.the_class_file_name_without_the_extension
```
***Example***
```
$ java mustafakhan.uk.to.App 
Hello World!
```

## With an imported Package

```
$ javac -d . App.java dsa/dataStructures/arrays/ArraysOperations.java
```
***This command compiles both ArraysOperations.java and App.java and places the compiled .class files in the correct directory structure under the current directory (-d .).***

### Alternative Approach
- If you prefer to compile all Java files in one go, you can use a wildcard to compile everything.

```
$ javac -d . **/*.java
```
OR
```
$ find . -name "*.java" | xargs javac -d .
```

## Alternative way to compile the code and generate jar
***.jar***-JAVA archive
### Generate jar
```
mvn clean install
```
***NOTE-*** run the command where `pom.xml` is present.

- you can find the the compiled classes inside `target/classes` folder.
- the jar will be located inside the `target` folder.
