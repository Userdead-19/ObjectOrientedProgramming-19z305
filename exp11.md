## Experiment 11 

### Object Oriented Programming Laboratory

Name: Abinav P

Rollnumber: 22z201

## 1 . String handling  -  String Concatenation

```java

public class exp11 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + s2;
        System.out.println(s3);
    }
}
```

### Output

```shell
$ javac exp11.java
$ java exp11
HelloWorld
```

## 2 . String handling  -  String Concatenation with other data types

```java
public class exp11 {
    public static void main(String[] args) {
        String s1 = "Hello";
        int a = 10;
        String s2 = s1 + a;
        System.out.println(s2);
    }
}
```

### Output

```shell
$ javac exp11.java
$ java exp11
Hello10
```

## 3. String handling -  String Conversion and toString() method

```java
public class exp11 {
    public static void main(String[] args) {
        int a = 10;
        String s1 = Integer.toString(a);
        System.out.println(s1);
    }
}
```

### Output

```shell
$ javac exp11.java
$ java exp11
10
```

## 4. String handling - charat() method

```java
public class exp11 {
    public static void main(String[] args) {
        String s1 = "Hello";
        char c = s1.charAt(0);
        System.out.println(c);
    }
}
```

### Output

```shell
$ javac exp11.java
$ java exp11
H
```

## 4b. String handling -  getChars()

```java

public class exp11 {
    public static void main(String[] args) {
        String s1 = "Hello";
        char[] c = new char[10];
        s1.getChars(0, 5, c, 0);
        System.out.println(c);
    }
}
```

### Output

```shell
$ javac exp11.java
$ java exp11
Hello
```

## 4c. String handling -  getBytes() 

```java
public class exp11 {
    public static void main(String[] args) {
        String s1 = "Hello";
        byte[] b = s1.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
```

### Output

```shell
$ javac exp11.java
$ java exp11
72
101
108
108
111
```
## 4d. String handling  - toCharArray()

```java
public class exp11 {
    public static void main(String[] args) {
        String s1 = "Hello";
        char[] c = s1.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
```

### Output

```shell
$ javac exp11.java
$ java exp11
H
e
l
l
o
```

## 5 .  String Comparison
## a. equals() and equalsIgnoreCase()
## b. regionMatches()
## c. startsWith() and endsWith()
## d. equals() and ==
## e. compareTo()

### generate for all the topics

```java
public class exp11 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";
        
        // a. equals() and equalsIgnoreCase()
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2)); // true
        
        // b. regionMatches()
        System.out.println(s1.regionMatches(0, s2, 0, 5)); // false
        
        // c. startsWith() and endsWith()
        System.out.println(s1.startsWith("He")); // true
        System.out.println(s1.endsWith("lo")); // true
        
        // d. equals() and ==
        String s3 = new String("Hello");
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1 == s3); // false
        
        // e. compareTo()
        System.out.println(s1.compareTo(s2)); // -32
    }
}
 
```

### Output

```shell
$ javac exp11.java
$ java exp11
false
true
false
true
true
true
false
-32
```

## 6. Searching Strings

```java
public class exp11 {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1.indexOf('e')); // 1
        System.out.println(s1.lastIndexOf('l')); // 3
    }
}
```

### Output

```shell
$ javac exp11.java
$ java exp11
1
3
```
## 7. Modifying a string
## a. substring()
## b. concat()
## c. replace()
## d. trim()

```java
public class exp11 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        
        // a. substring()
        String substring = s1.substring(6);
        System.out.println(substring); // "World"
        
        // b. concat()
        String concat = s1.concat("!");
        System.out.println(concat); // "Hello World!"
        
        // c. replace()
        String replace = s1.replace("World", "Java");
        System.out.println(replace); // "Hello Java"
        
        // d. trim()
        String trimmed = s1.trim();
        System.out.println(trimmed); // "Hello World"
    }
}
```

### Output

```shell
$ javac exp11.java
$ java exp11
World
Hello World!
Hello Java
Hello World
```

## 8. Data Conversion using valueOf()

```java
public class exp11 {
    public static void main(String[] args) {
        int a = 10;
        String s1 = String.valueOf(a);
        System.out.println(s1);
    }
}
```

### Output

```shell
$ javac exp11.java
$ java exp11
10
```

## 9.  Changing the case of characters within a string

```java
public class exp11 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println(s1.toUpperCase()); // "HELLO WORLD"
        System.out.println(s1.toLowerCase()); // "hello world"
    }
}
```

### Output

```shell
$ javac exp11.java
$ java exp11

HELLO WORLD
hello world
```

##  10. StringBuffer
## a. StringBuffer Constructors
## b. length() and capacity()
## c. ensureCapacity()
## d. setLength()
## e. charAt() and setCharAt()
## f. getChars()
## g. append()
## h. insert()
## i. reverse()
## j. delete() and deleteCharAt()
## k. replace()
## l. substring()

```java
public class StringEx{
    public static void main(String[] args) {
        // a. StringBuffer Constructors
        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer("Hello, ");
        StringBuffer stringBuffer3 = new StringBuffer(20); // Initial capacity

        // b. length() and capacity()
        System.out.println("b. length(): " + stringBuffer2.length());
        System.out.println("   capacity(): " + stringBuffer2.capacity());

        // c. ensureCapacity()
        stringBuffer2.ensureCapacity(30);
        System.out.println("c. After ensureCapacity(30): capacity() = " + stringBuffer2.capacity());

        // d. setLength()
        stringBuffer2.setLength(7);
        System.out.println("d. After setLength(7): " + stringBuffer2);

        // e. charAt() and setCharAt()
        char charAtIndex3 = stringBuffer2.charAt(3);
        System.out.println("e. charAt(3): " + charAtIndex3);

        stringBuffer2.setCharAt(3, 'p');
        System.out.println("   After setCharAt(3, 'p'): " + stringBuffer2);

        // f. getChars()
        char[] charArray = new char[5];
        stringBuffer2.getChars(0, 5, charArray, 0);
        System.out.print("f. getChars(0, 5, charArray, 0): ");
        for (char c : charArray) {
            System.out.print(c);
        }
        System.out.println();

        // g. append()
        stringBuffer2.append(" World!");
        System.out.println("g. After append(\" World!\"): " + stringBuffer2);

        // h. insert()
        stringBuffer2.insert(6, "Java ");
        System.out.println("h. After insert(6, \"Java \"): " + stringBuffer2);

        // i. reverse()
        stringBuffer2.reverse();
        System.out.println("i. After reverse(): " + stringBuffer2);

        // j. delete() and deleteCharAt()
        stringBuffer2.delete(6, 11);
        System.out.println("j. After delete(6, 11): " + stringBuffer2);

        stringBuffer2.deleteCharAt(5);
        System.out.println("   After deleteCharAt(5): " + stringBuffer2);

        // k. replace()
        stringBuffer2.replace(0, 5, "Hi");
        System.out.println("k. After replace(0, 5, \"Hi\"): " + stringBuffer2);

        // l. substring()
        String substring = stringBuffer2.substring(3, 8);
        System.out.println("l. substring(3, 8): " + substring);
    }
}
```

### Output

```shell
$ javac StringEx.java
$ java StringEx
b. length(): 7
   capacity(): 22
c. After ensureCapacity(30): capacity() = 46
d. After setLength(7): Hello,
e. charAt(3): l
   After setCharAt(3, 'p'): Helpo,
f. getChars(0, 5, charArray, 0): Helpo
g. After append(" World!"): Helpo, World!
h. After insert(6, "Java "): Helpo, Java World!
i. After reverse(): !dlroW avaJ ,opleH
j. After delete(6, 11): !dlroW ,opleH
   After deleteCharAt(5): !dlro ,opleH
k. After replace(0, 5, "Hi"): Hi, ,opleH
l. substring(3, 8): ,opl
```

## Result :
Thus the String handling programs are executed and the output is verified.