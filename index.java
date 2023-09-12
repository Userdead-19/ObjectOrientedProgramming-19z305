// import java.util.Scanner;

// public class index {
//   public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);
//     System.out.print("enter the two numbers to find greatest of them :");
//     int a = scan.nextInt();
//     int b = scan.nextInt();
//     if (a > b) {
//       System.out.println("a is the greatest");
//     } else {
//       System.out.println("b is the greatest");
//     }
//     scan.close();
//   }

// }

// import java.util.Scanner;

// public class index {
//   public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);
//     System.out.print("enter the student marks:");
//     float mark = scan.nextFloat();
//     if (mark > 90) {
//       System.out.println("the student is O graded");
//     } else if (mark > 80) {
//       System.out.println("the student is A graded");
//     } else if (mark > 70) {
//       System.out.println("th student is B graded");
//     } else if (mark > 60) {
//       System.out.println("the student is C graded");
//     } else {
//       System.out.println("the student is D graded");
//     }
//     scan.close();
//   }
// }

// .3) Check whether the given number is positive, negative or zero [ if..else
// if]
// import java.util.Scanner;

// public class index {
//   public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);
//     System.out.print("enter the number to check whether it is positive ornegative or zero :");
//     int a = scan.nextInt();
//     if (a > 0) {
//       System.out.println("the number is positive");
//     } else if (a < 0) {
//       System.out.println("the number is negative");
//     } else {
//       System.out.println("the number is zero");
//     }
//     scan.close();
//   }
// }

// 4) Take the length (L) and breadth (B) of the rectangle as input and find its
// area

// import java.util.Scanner;

// public class index {
//   public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);
//     System.out.print("enter the length and breadth of the rectangle :");
//     int l = scan.nextInt();
//     int b = scan.nextInt();
//     int area = l * b;
//     System.out.println("the area of the rectangle is :" + area);
//     scan.close();
//   }
// }

// 5)You have been given a number 'N'. Your task is to find the sum of all even
// numbers from 1 to N

// import java.util.Scanner;

// public class index {

//   public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);
//     System.out.print("enter the number to find the sum of even numbers from 1 to N :");
//     int n = scan.nextInt();
//     int sum = 0;
//     for (int i = 1; i <= n; i++) {
//       if (i % 2 == 0) {
//         sum = sum + i;
//       }
//     }
//     System.out.println("the sum of even numbers from 1 to N is :" + sum);
//     scan.close();
//   }
// }

// 6)For the given integer just print the sum of all even digits and odd digits
// separately.

// import java.util.Scanner;

// public class index {

//   public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);
//     System.out.print("enter the number to find the sum of even digits and odd digits separately :");
//     int n = scan.nextInt();
//     int sum = 0;
//     int sum1 = 0;
//     while (n > 0) {
//       int rem = n % 10;
//       if (rem % 2 == 0) {
//         sum = sum + rem;
//       } else {
//         sum1 = sum1 + rem;
//       }
//       n = n / 10;
//     }
//     System.out.println("the sum of even digits is :" + sum);
//     System.out.println("the sum of odd digits is :" + sum1);
//     scan.close();
//   }
// }

// 7) pattern

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
