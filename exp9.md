# Experiment 9
## Object Oriented Programming Laboratory
Name: Abinav P

Rollnumber: 22z201


### 1.Write a program to show the use of the ArrayList class of Java.util package [ In-built]

```java
import java.util.ArrayList;

public class exp9 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        list.add(1, "D");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());
    }
}
```
### Output
```shell   
$ javac exp9.java
$ java exp9
[A, B, C]
[A, D, B, C]
[A, D, C]
D
3

```

## 2.create a class A in learnjava package that access it in another class B by using import keyword.

```java
package learnjava;

public class a {
    public void console(String s) {
        System.out.println(s);
    }
}
```

```java
import learnjava.a;

public class b {
    public static void main(String[] args) {
        a obj = new a();
        obj.console("Hello World");
    }
}

```

### Output
```shell
$ javac b.java
$ java b
Hello World
```


### 2 b)Create a class Calculator inside a package name Advcalculate. To create a class inside a package, declare the package name in the first statement in your program. A class can have only one package declaration. Make use of this package  Advcalculate   in another program and use the class Calculator. Create more number of classes in   Advcalculate, and import the package to make use all the classes of this package. 

```java
package Advcalculate;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}
```

```java
import Advcalculate.Calculator;

public class exp9_2b {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(1, 2));
        System.out.println(obj.sub(1, 2));
        System.out.println(obj.mul(1, 2));
        System.out.println(obj.div(1, 2));
    }
}
```

### Output
```shell
$ javac exp9_2b.java
$ java exp9_2b
3
-1
2
0
```

### 3.Create user defined package university create the department sub-packages in Java.creates class Staff inside department sub package within university package.using the keyword “import”, add the user-defined packages in Java.

```java
package university.department;

import java.util.ArrayList;

public class staffs {
    public ArrayList<String> staffs = new ArrayList<String>();

    public void add(String s) {
        staffs.add(s);
    }

    public void remove(String s) {
        staffs.remove(s);
    }

    public void print() {
        System.out.println(staffs);
    }

    public int size() {
        return staffs.size();
    }

}
```

```java
import university.department.staffs;

public class exp9_3 {
    public static void main(String[] args) {
        staffs obj = new staffs();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.print();
        obj.remove("B");
        obj.print();
        System.out.println(obj.size());
    }
}
```


### Output
```shell
$ javac exp9_3.java
$ java exp9_3
[A, B, C]
[A, C]
2
```

### Result :

Thus the program for the Experiment 9 has been executed and the output has been verified successfully.
