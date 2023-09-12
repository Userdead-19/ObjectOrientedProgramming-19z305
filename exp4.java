
//Java allows two or more statements to be grouped into blocks of code ,also called code blocks. A block can be a target for  Java's if and for statements. Write a program that uses a block od code as a target of a for loop and generate output as follows 7
// import java.util.Scanner;

// public class exp4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int i, x = 20, n;
//         System.out.println("Enter the value of n");
//         n = sc.nextInt();
//         for (i = 0; i < n; i++) {
//             System.out.println("x is " + x);
//             System.out.println("y is " + i);
//             x = x - 2;
//         }
//         sc.close();
//     }
// }

// Write a java program that uses double variables to compute area of circle.

// import java.util.Scanner;

// public class exp4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double r, area;
//         System.out.println("Enter the radius of circle");
//         r = sc.nextDouble();
//         area = 3.14 * r * r;
//         System.out.println("Area of circle is " + area);
//         sc.close();
//     }
// }

//Write a java program  to find factorial of a number 

// import java.util.Scanner;

// public class exp4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n, i, fact = 1;
//         System.out.println("Enter the value of n");
//         n = sc.nextInt();
//         for (i = 1; i <= n; i++) {
//             fact = fact * i;
//         }
//         System.out.println("Factorial of " + n + " is " + fact);
//         sc.close();
//     }
// }

//Write a java program  to check whether the given year is leap year or not 

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