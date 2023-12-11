## Experiment 12
### Object Oriented Programming Laboratory

Name: Abinav P

Rollnumber: 22z201

## 1 . Write a Java program for reading characters from the console

```java
import java.io.*;

public class exp12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a character");
        char c = (char) br.read();
        System.out.println("The character is " + c);
    }
}
```


### Output

```shell
$ javac exp12.java
$ java exp12
Enter a character
a
The character is a
```
## 2. Write a Java program to Read a string from console using a BufferReader

```java
import java.io.*;

public class exp12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string");
        String s = br.readLine();
        System.out.println("The string is " + s);
    }
}
```

### Output

```shell
$ javac exp12.java
$ java exp12
Enter a string
Hello World
The string is Hello World
```

## 3. Demonstrate the use of  write() to perform console output

```java
import java.io.*;

public class exp12 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Hello World");
        bw.flush();
    }
}
```

### Output

```shell
$ javac exp12.java
$ java exp12
Hello World
```

## 4. Illustrate the usage  if  PrintWriter to handle console output

```java
import java.io.*;

public class exp12 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Hello World");
        pw.flush();
    }
}
```

### Output

```shell
$ javac exp12.java
$ java exp12
Hello World
```

## 5. Write a Java program which uses read( ) to input and display the contents of a file that contains ASCII text.

```java
import java.io.*;

public class exp12 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("exp12.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        br.close();
    }
}
```

### Output

```shell
$ javac exp12.java
$ java exp12
Hello World
```

## 6. Write a Java program to copy a file called SOURCE.TXT to a file called DESTINATION.TXT
    
```java
import java.io.*;

public class exp12 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("source.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("destination.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String s;
        while ((s = br.readLine()) != null) {
            bw.write(s);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
```

### Output

```shell
$ javac exp12.java
$ java exp12
```

## 7 . State how you can manage File resources by automating the closing process through Automatic Resource Management (ARM) feature. Illustrate with a program

```java
import java.io.*;

public class exp12 {
    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader("source.txt");
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter("destination.txt");
                BufferedWriter bw = new BufferedWriter(fw);) {
            String s;
            while ((s = br.readLine()) != null) {
                bw.write(s);
                bw.newLine();
            }
        }
    }
}
```

### Output

```shell
$ javac exp12.java
$ java exp12
```

## Result 

Thus the above programs are executed and the output is verified
