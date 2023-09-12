# Experiment 5
## Object Oriented Programming Laboratory
Name: Abinav P

Rollnumber: 22z201

### 1. Sum an array
**Aim: 1.Java Program to find the sum of all the elements in an array**

```java
import java.util.Scanner;

public class exp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, sum = 0;
        System.out.println("Enter the number of elements in the array");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of the elements of the array is " + sum);
        sc.close();
    }
}
```

```java
Enter the number of elements in the array
5
Enter the elements of the array
1
2
3
4
5
The sum of the elements of the array is 15

```
---
### 2.  MAXIMUM AND MINIMUM
**AIM: Display the sum of maximum and minimum values in the given array.**

```java
import java.util.Scanner;

public class exp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, max, min;
        System.out.println("Enter the number of elements in the array");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        min = arr[0];
        for (i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The sum of the maximum and minimum elements of the array is " + (max + min));
        sc.close();
    }
}
```

```java
Enter the number of elements in the array
5
Enter the elements of the array
1
2
3
4
5
The sum of the maximum and minimum elements of the array is 6


```
---
### 3.Missing number
**AIM:Find the missing element in the range from 1 to N+1 without sorting the array**

```java
import java.util.Scanner;

public class exp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, sum = 0, sum1 = 0;
        System.out.println("Enter the number of elements in the array");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        for (i = 1; i <= n + 1; i++) {
            sum1 = sum1 + i;
        }
        System.out.println("The missing element is " + (sum1 - sum));
        sc.close();
    }
}
```

```java
Enter the number of elements in the array
5
Enter the elements of the array
1
2
3
4
6
The missing element is 5

```


---
### 4. Majoirty element
**AIM: Find the majority element from the given array.**

```java
import java.util.Scanner;

public class exp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, n, count = 0, max = 0, index = 0;
        System.out.println("Enter the number of elements in the array");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            count = 0;
            for (j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                index = i;
            }
        }
        if (max > n / 2) {
            System.out.println("The majority element is " + arr[index]);
        } else {
            System.out.println("There is no majority element");
        }
        sc.close();
    }
}
```

```java
Enter the number of elements in the array
5
Enter the elements of the array
1
2
3
4
5
There is no majority element
```
---
### 5. Insertion of an element
**AIM: Write a java program to Insert an element in the array.**

```java
import java.util.Scanner;

public class exp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, pos, ele;
        System.out.println("Enter the number of elements in the array");
        n = sc.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("Enter the elements of the array");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position where you want to insert the element");
        pos = sc.nextInt();
        System.out.println("Enter the element to be inserted");
        ele = sc.nextInt();
        for (i = n; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = ele;
        System.out.println("The array after insertion is");
        for (i = 0; i < n + 1; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
```
```java
Enter the number of elements in the array
5
Enter the elements of the array
1
2
3
4
5
Enter the position where you want to insert the element
3
Enter the element to be inserted
6
The array after insertion is
1
2
6
3
4
5
```
---
### 6. Sum of matrices
**AIM: Write a java program to print the sum of two matrices.**

```java
import java.util.Scanner;

public class exp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, n, m;
        System.out.println("Enter the number of rows of the matrix");
        n = sc.nextInt();
        System.out.println("Enter the number of columns of the matrix");
        m = sc.nextInt();
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        int[][] arr3 = new int[n][m];
        System.out.println("Enter the elements of the first matrix");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("The sum of the two matrices is");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
```
```java
Enter the number of rows of the matrix
2
Enter the number of columns of the matrix
2
Enter the elements of the first matrix
1
2
3
4
Enter the elements of the second matrix
5
6
7
8
The sum of the two matrices is
6 8
10 12

```
---
### 7. Write java program to print the pattern. [Nested for loop ]
**AIM: Write a Java program to print a left indented triangle with asterisks (*)**

```java
    <your code>
```
```java
    <your output>
```
---
## Result
Hence the given programs were executed sucessfully