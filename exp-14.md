## Experiment - 14 Generics

Name: Abinav P
Roll no: 22z201

## 1. Reuse same class for two different data types and demonstrate that  Generics helps in code reusability with ease.

```java
import java.util.Scanner;

class Pair<T> {
    T first;
    

    Pair(T first) {
        this.first = first;
    }

    void display() {
        System.out.println("First: " + first );
    }
}

public class Exp14_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int a = sc.nextInt();
        
        Pair<Integer> p1 = new Pair<>(a);
        p1.display();
        System.out.print("Enter a string: ");
        String s1 = sc.next();
        Pair<String> p2 = new Pair<>(s1);
        p2.display();
        sc.close();
    }
}
```

### Output

```shell
Enter a integers: 5
First: 5
Enter a string: Hello
First: Hello
```

## 2. Write a java program for Generic Type with more than one parameter

```java
import java.util.Scanner;

class Pair<T, U> {
    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    void display() {
        System.out.println("First: " + first + ", Second: " + second);
    }
}

public class Exp14_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Pair<Integer, Integer> p1 = new Pair<>(a, b);
        p1.display();
        System.out.print("Enter two strings: ");
        String s1 = sc.next();
        String s2 = sc.next();
        Pair<String, String> p2 = new Pair<>(s1, s2);
        p2.display();
        sc.close();
    }
}
```

### Output

```shell
Enter two integers: 5 6
First: 5, Second: 6
Enter two strings: Hello World
First: Hello, Second: World
```


## 3. Write a java program for creating generic methods that can be called with different types of arguments.

```java
import java.util.Scanner;

class Pair<T> {
    T first;
    T second;

    Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    void display() {
        System.out.println("First: " + first + ", Second: " + second);
    }
}

public class Exp14_3 {
    static <T> void swap(Pair<T> p) {
        T temp = p.first;
        p.first = p.second;
        p.second = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Pair<Integer> p1 = new Pair<>(a, b);
        p1.display();
        swap(p1);
        p1.display();
        System.out.print("Enter two strings: ");
        String s1 = sc.next();
        String s2 = sc.next();
        Pair<String> p2 = new Pair<>(s1, s2);
        p2.display();
        swap(p2);
        p2.display();
        sc.close();
    }
}
```

### Output

```shell
Enter two integers: 5 6
First: 5, Second: 6
First: 6, Second: 5
Enter two strings: Hello World
First: Hello, Second: World
First: World, Second: Hello
```

## Result:

Thus, the Generic classes and methods were implemented and the results were verified.
