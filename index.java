// // import java.util.Scanner;

// // public class index {
// // public static void main(String[] args) {
// // Scanner scan = new Scanner(System.in);
// // System.out.print("enter the two numbers to find greatest of them :");
// // int a = scan.nextInt();
// // int b = scan.nextInt();
// // if (a > b) {
// // System.out.println("a is the greatest");
// // } else {
// // System.out.println("b is the greatest");
// // }
// // scan.close();
// // }

// // }

// // import java.util.Scanner;

// // public class index {
// // public static void main(String[] args) {
// // Scanner scan = new Scanner(System.in);
// // System.out.print("enter the student marks:");
// // float mark = scan.nextFloat();
// // if (mark > 90) {
// // System.out.println("the student is O graded");
// // } else if (mark > 80) {
// // System.out.println("the student is A graded");
// // } else if (mark > 70) {
// // System.out.println("th student is B graded");
// // } else if (mark > 60) {
// // System.out.println("the student is C graded");
// // } else {
// // System.out.println("the student is D graded");
// // }
// // scan.close();
// // }
// // }

// // .3) Check whether the given number is positive, negative or zero [
// if..else
// // if]
// // import java.util.Scanner;

// // public class index {
// // public static void main(String[] args) {
// // Scanner scan = new Scanner(System.in);
// // System.out.print("enter the number to check whether it is positive
// ornegative or zero :");
// // int a = scan.nextInt();
// // if (a > 0) {
// // System.out.println("the number is positive");
// // } else if (a < 0) {
// // System.out.println("the number is negative");
// // } else {
// // System.out.println("the number is zero");
// // }
// // scan.close();
// // }
// // }

// // 4) Take the length (L) and breadth (B) of the rectangle as input and find
// its
// // area

// // import java.util.Scanner;

// // public class index {
// // public static void main(String[] args) {
// // Scanner scan = new Scanner(System.in);
// // System.out.print("enter the length and breadth of the rectangle :");
// // int l = scan.nextInt();
// // int b = scan.nextInt();
// // int area = l * b;
// // System.out.println("the area of the rectangle is :" + area);
// // scan.close();
// // }
// // }

// // 5)You have been given a number 'N'. Your task is to find the sum of all
// even
// // numbers from 1 to N

// // import java.util.Scanner;

// // public class index {

// // public static void main(String[] args) {
// // Scanner scan = new Scanner(System.in);
// // System.out.print("enter the number to find the sum of even numbers from 1
// to N :");
// // int n = scan.nextInt();
// // int sum = 0;
// // for (int i = 1; i <= n; i++) {
// // if (i % 2 == 0) {
// // sum = sum + i;
// // }
// // }
// // System.out.println("the sum of even numbers from 1 to N is :" + sum);
// // scan.close();
// // }
// // }

// // 6)For the given integer just print the sum of all even digits and odd
// digits
// // separately.

// // import java.util.Scanner;

// // public class index {

// // public static void main(String[] args) {
// // Scanner scan = new Scanner(System.in);
// // System.out.print("enter the number to find the sum of even digits and odd
// digits separately :");
// // int n = scan.nextInt();
// // int sum = 0;
// // int sum1 = 0;
// // while (n > 0) {
// // int rem = n % 10;
// // if (rem % 2 == 0) {
// // sum = sum + rem;
// // } else {
// // sum1 = sum1 + rem;
// // }
// // n = n / 10;
// // }
// // System.out.println("the sum of even digits is :" + sum);
// // System.out.println("the sum of odd digits is :" + sum1);
// // scan.close();
// // }
// // }

// // 7) pattern

// // import java.util.*;

// // public class index {

// // public static void main(String[] args) {
// // Scanner scan = new Scanner(System.in);
// // System.out.print("enter the number of rows :");
// // int n = scan.nextInt();
// // for (int i = 1; i <= n; i++) {
// // for (int j = 1; j <= i; j++) {
// // System.out.print("* ");
// // }
// // System.out.println();
// // }
// // scan.close();
// // }

// // }

// // Create a class Employee with the following details.
// // The data members are name,address, age, gender and the method display() to
// show employee details.

// // import java.util.Scanner;

// // class Employee {
// // String name;
// // String address;
// // int age;
// // String gender;

// // void display() {
// // System.out.println("Name :" + this.name);
// // System.out.println("Address :" + address);
// // System.out.println("Age : " + this.age);
// // System.out.println("gender: " + this.gender);
// // }
// // }

// // class index {
// // public static void main(String[] args) {
// // Employee emp = new Employee();
// // Scanner scan = new Scanner(System.in);
// // System.out.print("enter the name :");
// // emp.name = scan.nextLine();
// // System.out.print("enter the address :");
// // emp.address = scan.nextLine();

// // System.out.print("enter the age :");
// // emp.age = scan.nextInt();
// // System.out.print("enter your gender:");
// // emp.gender = scan.next();
// // emp.display();
// // scan.close();
// // }
// // }

// //2. Create classes that capture bank customers and bank accounts.A customer
// has a first and last name.An account has a customer and balance.Make objects
// for two accounts held by the same customer.

// import java.util.Scanner;

// class Customer {
// String firstName;
// String lastName;
// }

// class Account {
// Customer customer;
// double balance;
// }

// class index {
// public static void main(String[] args) {
// Account acc1 = new Account();
// Account acc2 = new Account();
// Customer cust = new Customer();
// Scanner scan = new Scanner(System.in);
// System.out.print("enter the first name :");
// cust.firstName = scan.nextLine();
// System.out.print("enter the last name :");
// cust.lastName = scan.nextLine();
// System.out.print("enter the balance :");
// acc1.balance = scan.nextDouble();
// acc2.balance = scan.nextDouble();
// acc1.customer = cust;
// acc2.customer = cust;
// System.out.println("the first account details are :");
// System.out.println("the first name is :" + acc1.customer.firstName);
// System.out.println("the last name is :" + acc1.customer.lastName);
// System.out.println("the balance is :" + acc1.balance);
// System.out.println("the second account details are :");
// System.out.println("the first name is :" + acc2.customer.firstName);
// System.out.println("the last name is :" + acc2.customer.lastName);
// System.out.println("the balance is :" + acc2.balance);
// scan.close();
// }
// }

/**
 * index
 */
public class index {

    public static void main(String[] args) {

    }
}