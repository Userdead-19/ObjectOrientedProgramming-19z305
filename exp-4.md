# Experiment 4
## Object Oriented Programming Laboratory
Name: Abinav P

Rollnumber: 22z201

### 1. to create a block of code
**Aim: Java allows two or more statements to be grouped into blocks of code ,also called code blocks. A block can be a target for  Java's if and for statements. Write a program that uses a block od code as a target of a for loop and generate output as follows**

```java
import java.util.Scanner;

public class exp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, x = 20, n;
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            System.out.println("x is " + x);
            System.out.println("y is " + i);
            x = x - 2;
        }
        sc.close();
    }
}

```
```java
Enter the value of n
10
x is 20
y is 0
x is 18
y is 1
x is 16
y is 2
x is 14
y is 3
x is 12
y is 4
x is 10
y is 5
x is 8
y is 6
x is 6
y is 7
x is 4
y is 8
x is 2
y is 9
```
---
### 2.area of circle

**AIM:  Write a java program that uses double variables to compute area of circle.**

```java
import java.util.Scanner;

public class exp4 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, area;
        System.out.println("Enter the radius of circle");
        r = sc.nextDouble();
        area = 3.14 * r * r;
        System.out.println("Area of circle is " + area);
        sc.close();
 }   
}
```
```java
PS D:\java_files> cd "d:\java_files\" ; if ($?) { javac exp4.java } ; if ($?) { java exp4 }
Enter the radius of circle
1.04
Area of circle is 3.396224
```
---
### 3.To calculate function
**AIM:Write a java program  to find factorial of a numbers**

```java
import java.util.Scanner;

public class exp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, fact = 1;
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
        sc.close();
    }
}
```
```java
PS D:\java_files> cd "d:\java_files\" ; if ($?) { javac exp4.java } ; if ($?) { java exp4 }
Enter the value of n
4
Factorial of 4 is 24
```
---
### 4. Check for leap year
**AIM: Write a java program  to check whether the given year is leap year or not**

```java
import java.util.Scanner;

public class exp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter the year");
        year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
        sc.close();
    }
}
```
```java
PS D:\java_files> cd "d:\java_files\" ; if ($?) { javac exp4.java } ; if ($?) { java exp4 }
Enter the year
2000
It is a leap yea
```
---
### 5. Odd or even
**AIM:  Write a java program  to check whether the number is odd or even**

```java
import java.util.Scanner;

public class exp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("It is an even number");
        } else {
            System.out.println("It is an odd number");
        }
        sc.close();
    }
}
```

```java
PS D:\java_files> cd "d:\java_files\" ; if ($?) { javac exp4.java } ; if ($?) { java exp4 }
Enter the number
5
It is an odd number

```
---
### 6. break statement
**AIM: Make use of break statement in a while loop to calculate sum of all positive numbers**

```java
import java.util.Scanner;

public class exp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        System.out.println("Enter the number");
        n = sc.nextInt();
        while (n >= 0) {
            sum = sum + n;
            System.out.println("Enter the number");
            n = sc.nextInt();
            if (n < 0) {
                break;
            }
        }
        System.out.println("Sum of positive numbers is " + sum);
        sc.close();
    }
}
```

```java
PS D:\java_files> cd "d:\java_files\" ; if ($?) { javac exp4.java } ; if ($?) { java exp4 }
Enter the number
1
Enter the number
2
Enter the number
3
Enter the number
-1
Sum of positive numbers is 6
```
---
### 7. Palindrome Number
**AIM: Write a java program to check palindrome number**

```java
import java.util.Scanner;

public class exp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, rev = 0, rem, temp;
        System.out.println("Enter the number");
        n = sc.nextInt();
        temp = n;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (temp == rev) {
            System.out.println("It is a palindrome number");
        } else {
            System.out.println("It is not a palindrome number");
        }
        sc.close();
    }
}
```

```java
PS D:\java_files> cd "d:\java_files\" ; if ($?) { javac exp4.java } ; if ($?) { java exp4 }
Enter the number
121
It is a palindrome number

```
---
## Result
Hence the given programs were executed sucessfully