// // 1. Method overloading by changing the number of arguments:

// // Create two methods, the first method sum() will perform addition of two
// numbers and second method sum() will perform addition of three numbers by
// overloading concept.

// import java.util.Scanner;

// class customfunctions {
// int sum(int a, int b) {
// return a + b;
// }

// int sum(int a, int b, int c) {
// return a + b + c;
// }
// }

// // public class exp7 {

// // public static void main(String[] args) {
// // customfunctions cf = new customfunctions();
// // Scanner scan = new Scanner(System.in);
// // System.out.print("enter the first number :");
// // int a = scan.nextInt();
// // System.out.print("enter the second number :");
// // int b = scan.nextInt();
// // System.out.print("enter the third number :");
// // int c = scan.nextInt();
// // System.out.println("the sum of two numbers is :" + cf.sum(a, b));
// // System.out.println("the sum of three numbers is :" + cf.sum(a, b, c));
// // scan.close();
// // }

// // }

// 2. Method overloading by changing data type of parameters
// Create two methods having the same name but will differ in the data type of
// parameters. The first method sub() will receive two integer arguments and the
// second method sub() will receive two double arguments.

// import java.util.Scanner;

// class customfunctions {
// int sub(int a, int b) {
// return a - b;
// }

// double sub(double a, double b) {
// return a - b;
// }
// }

// public class exp7 {

// public static void main(String[] args) {
// customfunctions cf = new customfunctions();
// Scanner scan = new Scanner(System.in);
// System.out.print("enter the first number :");
// int a = scan.nextInt();
// System.out.print("enter the second number :");
// int b = scan.nextInt();
// System.out.print("enter the third number :");
// double c = scan.nextDouble();
// System.out.print("enter the fourth number :");
// double d = scan.nextDouble();
// System.out.println("the difference of two numbers is :" + cf.sub(a, b));
// System.out.println("the difference of two numbers is :" + cf.sub(c, d));
// scan.close();
// }

// }

// 3. Method overloading by changing sequence of data type of parameters
// The method multiply() must be overloaded based on the sequence of data type
// of parameters. The overloaded methods have to calculate multiplication of two
// numbers based on the sequence of argument types while calling methods at
// runtime

import java.util.Scanner;

class customfunctions {
    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

public class exp7 {

    public static void main(String[] args) {
        customfunctions cf = new customfunctions();
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the first number :");
        int a = scan.nextInt();
        System.out.print("enter the second number :");
        int b = scan.nextInt();
        System.out.print("enter the third number :");
        int c = scan.nextInt();
        System.out.println("the product of two numbers is :" + cf.multiply(a, b));
        System.out.println("the product of three numbers is :" + cf.multiply(a, b,
                c));
        scan.close();
    }
}