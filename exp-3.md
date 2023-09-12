# Experiment 3
## Object Oriented Programming Laboratory
Name: Abinav P

Rollnumber: 22z201

### 1. Find greatest of two numbers
**Aim: Write a Java program to find the greatest of given two number**

```java
import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("enter the two numbers to find greatest of them :");
    int a = scan.nextInt();
    int b = scan.nextInt();
    if (a > b) {
      System.out.println("a is the greatest");
    } else {
      System.out.println("b is the greatest");
    }
    scan.close();
  }

}
```
```java
PS D:\java_files> cd "d:\java_files\" ; if ($?) { javac index.java } ; if ($?) { java index }
enter the two numbers to find greatest of them :7
40
```
---
### 2. Prepare Grade sheet for a student

**AIM: Write a java program to create a Grade Sheet system for one student**

```java
import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("enter the student marks:");
    float mark = scan.nextFloat();
    if (mark > 90) {
      System.out.println("the student is O graded");
    } else if (mark > 80) {
      System.out.println("the student is A graded");
    } else if (mark > 70) {
      System.out.println("th student is B graded");
    } else if (mark > 60) {
      System.out.println("the student is C graded");
    } else {
      System.out.println("the student is D graded");
    }
    scan.close();
  }
}

```
```java
PS D:\java_files> cd "d:\java_files\" ; if ($?) { javac index.java } ; if ($?) { java index }
enter the student marks:70
the student is C graded
```
---
### 3.Check whether the given number is positive, negative or zero
**AIM: Write a Java program to compare a given number for a positive / negative / zero magnitude**

```java
import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("enter the number to check whether it is positive ornegative or zero :");
    int a = scan.nextInt();
    if (a > 0) {
      System.out.println("the number is positive");
    } else if (a < 0) {
      System.out.println("the number is negative");
    } else {
      System.out.println("the number is zero");
    }
    scan.close();
  }
}

```
```java
PS D:\java_files> cd "d:\java_files\" ; if ($?) { javac index.java } ; if ($?) { java index }
enter the number to check whether it is positive ornegative or zero :-3 
the number is negative
```
---
### 4. Take the length (L) and breadth (B) of the rectangle as input and find its area
**AIM: Write a Java program to calculate length of a rectangle, with given dimensions, Length and Breadth**

```java
import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("enter the length and breadth of the rectangle :");
    int l = scan.nextInt();
    int b = scan.nextInt();
    int area = l * b;
    System.out.println("the area of the rectangle is :" + area);
    scan.close();
  }
}

```
```java
PS D:\java_files> cd "d:\java_files\" ; if ($?) { javac index.java } ; if ($?) { java index }
enter the length and breadth of the rectangle :2 3
the area of the rectangle is :6
```
---
### 5. You have been given a number 'N'. Your task is to find the sum of all even numbers from 1 to N
**AIM: Write a Java program to find sum of all number from 1 to some given number, N**

```java
import java.util.Scanner;

public class index {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("enter the number to find the sum of even numbers from 1 to N :");
    int n = scan.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        sum = sum + i;
      }
    }
    System.out.println("the sum of even numbers from 1 to N is :" + sum);
    scan.close();
  }
}
```
```java
enter the number to find the sum of even numbers from 1 to N :10
the sum of even numbers from 1 to N is :30
```
---
### 6. For the given integer just print the sum of all even digits and odd digits separately.
**AIM: Write a Java program to calculate sum of all even number and odd numbers seperately, from 1 to some given number N**

```java
import java.util.Scanner;

public class index {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("enter the number to find the sum of even digits and odd digits separately :");
    int n = scan.nextInt();
    int sum = 0;
    int sum1 = 0;
    while (n > 0) {
      int rem = n % 10;
      if (rem % 2 == 0) {
        sum = sum + rem;
      } else {
        sum1 = sum1 + rem;
      }
      n = n / 10;
    }
    System.out.println("the sum of even digits is :" + sum);
    System.out.println("the sum of odd digits is :" + sum1);
    scan.close();
  }
}

```
```java
PS D:\java_files> cd "d:\java_files\" ; if ($?) { javac index.java } ; if ($?) { java index }
enter the number to find the sum of even digits and odd digits separately :1234
the sum of even digits is :6
the sum of odd digits is :4
```
---
### 7. Write java program to print the pattern. [Nested for loop ]
**AIM: Write a Java program to print a left indented triangle with asterisks (*)**

```java
import java.util.*;

public class index {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("enter the number of rows :");
    int n = scan.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    scan.close();
  }

}

```
```java
PS D:\java_files> cd "d:\java_files\" ; if ($?) { javac index.java } ; if ($?) { java index }
enter the number of rows :5
*
* *
* * *
* * * *
* * * * * 
```
---
## Result
Hence the given programs were executed sucessfully