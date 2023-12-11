## Experiment 11 A 
### Object Oriented Programming Laboratory

Name: Abinav P

Rollnumber: 22z201

## 1 . Write a java program to convert an array to string 

```java
import java.util.Arrays;

public class exp11a {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(arr));
    }
}
```

### Output

```shell
$ javac exp11a.java
$ java exp11a
[1, 2, 3, 4, 5]
```

## 2. To Print duplicate characters from the string

```java
import java.util.Scanner;

public class exp11a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        int[] arr = new int[256];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (arr[i] > 1) {
                System.out.println((char) i + " " + arr[i]);
            }
        }
    }
}
```

### Output

```shell
$ javac exp11a.java
$ java exp11a
Enter a string
Hello World
l 3
o 2
```

## 3. To check if two strings are anagrams of each other

```java
import java.util.Arrays;
import java.util.Scanner;

public class exp11a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = sc.nextLine();
        System.out.println("Enter another string");
        String s2 = sc.nextLine();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (Arrays.equals(c1, c2)) {
            System.out.println("The strings are anagrams");
        } else {
            System.out.println("The strings are not anagrams");
        }
    }
}
```

### Output

```shell
$ javac exp11a.java
$ java exp11a
Enter a string
Hello
Enter another string
World
The strings are not anagrams
```

## 4 . To convert string to integer

```java
import java.util.Scanner;

public class exp11a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        int num = Integer.parseInt(s);
        System.out.println("The integer is " + num);
    }
}
```

### Output

```shell
$ javac exp11a.java
$ java exp11a
Enter a string
10
The integer is 10
```

## 5. To count the number of words in a given string sentence
```java
import java.util.Scanner;

public class exp11a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string sentence");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        int wordCount = words.length;
        System.out.println("The number of words in the sentence is: " + wordCount);
    }
}

```

## Output 
```shell
$ javac exp11a.java
$ java exp11a
Enter a string sentence
Hello World
The number of words in the sentence is: 2

```

## 6 . Write a program to get input as a string from user and arrange each word in Alphabetical Order.

```java
import java.util.Arrays;
import java.util.Scanner;

public class exp11a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            char[] c = words[i].toCharArray();
            Arrays.sort(c);
            words[i] = new String(c);
        }
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
```

### Output

```shell
$ javac exp11a.java
$ java exp11a
Enter a string
Hello World
elloH dlroW
```

## Result :

Thus, the String handling programs were executed and the output was verified
