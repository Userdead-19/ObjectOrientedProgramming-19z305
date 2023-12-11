## Expirement 13: Lambda Expressions

Name: Abinav P
Roll no: 22z201

## 1. Write a Java program to implement a lambda expression to find the sum of two integers. 

```java
import java.util.Scanner;

interface Sum {
    int add(int a, int b);
}

public class Exp13_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Sum s = (x, y) -> x + y;
        System.out.println("Sum: " + s.add(a, b));
        sc.close();
    }
}
```

### Output

```shell
Enter two numbers: 5 6
Sum: 11
```

## 2. Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.

```java

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exp13_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter strings: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        Collections.sort(list, (a, b) -> a.compareTo(b));
        System.out.println("Sorted list: " + list);
        sc.close();
    }
}
```

### Output

```shell
Enter number of strings: 5
Enter strings:
hello
world
this
is
abinav
Sorted list: [abinav, hello, is, this, world]
```

## 3. Write a Java program to implement a lambda expression to concatenate two strings.

```java
import java.util.Scanner;

interface Concat {
    String concat(String a, String b);
}

public class Exp13_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two strings: ");
        String a = sc.next();
        String b = sc.next();
        Concat c = (x, y) -> x + y;
        System.out.println("Concatenated string: " + c.concat(a, b));
        sc.close();
    }
}
```

### Output

```shell
Enter two strings: hello world
Concatenated string: helloworld
```

## 4. Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.

```java
import java.util.ArrayList;
import java.util.Scanner;

interface MaxMin {
    int max(ArrayList<Integer> list);

    int min(ArrayList<Integer> list);
}

public class Exp13_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter integers: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        MaxMin m = (x) -> {
            int max = x.get(0);
            for (int i = 1; i < x.size(); i++) {
                if (x.get(i) > max) {
                    max = x.get(i);
                }
            }
            return max;
        };
        System.out.println("Maximum: " + m.max(list));
        MaxMin m1 = (x) -> {
            int min = x.get(0);
            for (int i = 1; i < x.size(); i++) {
                if (x.get(i) < min) {
                    min = x.get(i);
                }
            }
            return min;
        };
        System.out.println("Minimum: " + m1.min(list));
        sc.close();
    }
}
```

### Output

```shell
Enter number of integers: 5
Enter integers:
1
2
3
4
5
Maximum: 5
Minimum: 1
```

##  5. Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list.

```java
import java.util.ArrayList;
import java.util.Scanner;

interface Sum {
    int sum(ArrayList<Integer> list);
}

public class Exp13_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter integers: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Sum s = (x) -> {
            int sum = 0;
            for (int i = 0; i < x.size(); i++) {
                if (x.get(i) % 2 == 0) {
                    sum += x.get(i) * x.get(i);
                }
            }
            return sum;
        };
        System.out.println("Sum of squares of even numbers: " + s.sum(list));
        Sum s1 = (x) -> {
            int sum = 0;
            for (int i = 0; i < x.size(); i++) {
                if (x.get(i) % 2 != 0) {
                    sum += x.get(i) * x.get(i);
                }
            }
            return sum;
        };
        System.out.println("Sum of squares of odd numbers: " + s1.sum(list));
        sc.close();
    }
}
```

### Output

```shell
Enter number of integers: 5
Enter integers:
1
2
3
4
5
Sum of squares of even numbers: 20
Sum of squares of odd numbers: 35
```

## Result

The programs were executed successfully and the output was verified.
