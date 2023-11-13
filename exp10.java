
/*
 * 1. Consider a program that reads an integer from the user and prints its
 * reciprocal. If the
 * user enters zero, the program will throw an exception. Write the code to
 * handle this
 * exception using a try-catch block:
 */
// import java.util.Scanner;
// import java.lang.Exception;

// class exp10 {
// public static void main(String[] args) {
// try {
// Scanner scan = new Scanner(System.in);
// System.out.print("enter the number :");
// int n = scan.nextInt();
// if (n == 0) {
// throw new Exception("the number is zero");
// }
// float reciprocal = 1 / n;
// System.out.println("the reciprocal of the number is :" + reciprocal);
// } catch (Exception e) {
// System.out.println("the exception is :" + e);

// } finally {
// System.out.println("the program is executed");
// }
// }
// }

/*
 * Define a class that has static methods main(), p(), q(), r() and s(). The
 * main() method
 * calls p(). Method p() calls q(). Method q() calls r(). Method r() calls
 * s().Method s()
 * declares a local array with six integer type elements and then attempts to
 * access the
 * element at position 10. Therefore, an exception of type
 * ArrayIndexOutOfBoundsException is generated. Each method has a catch block
 * for this
 * type of exception. The catch blocks in q(), r() and s() contain a throw
 * statement to
 * generate this type of exception. Indicate the flow of control during the
 * execution by
 * displaying the suitable output messages.Also include a finally block with
 * print
 * statements.
 */

// class exp10 {
// public static void s() {
// int[] arr = new int[6];
// try {
// arr[10] = 10;
// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("the exception is :" + e);
// throw e;
// } finally {
// System.out.println("the program is executed");
// }
// }

// public static void r() {
// try {
// s();
// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("the exception is :" + e);
// throw e;
// } finally {
// System.out.println("the program is executed");
// }
// }

// public static void q() {

// try {
// r();
// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("the exception is :" + e);
// throw e;
// } finally {
// System.out.println("the program is executed");
// }
// }

// public static void p() {
// try {
// q();
// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("the exception is :" + e);
// throw e;
// } finally {
// System.out.println("the program is executed");
// }
// }

// public static void main(String[] args) {
// try {
// p();
// } catch (Exception e) {
// System.out.println("the exception is :" + e);
// } finally {
// System.out.println("the program is executed");
// }
// }
// }

/*3. Create a class Student with the data members Name, Register Number, Mark1, Mark2,
Mark3, Total and Average. Using necessary member functions get the input, calculate
Total and Average and display the student information’s. If the register number exceeds
6 digits then raise one user defined exception called InvalidRegNoException. Similarly if
marks value is greater than 100 throw an exception called MarkOutOfBoundsException */

import java.util.Scanner;
import java.lang.Exception;

class InvalidRegNoException extends Exception {
    InvalidRegNoException(String s) {
        super(s);
    }
}

class MarkOutOfBoundsException extends Exception {
    MarkOutOfBoundsException(String s) {
        super(s);
    }
}

class student {
    String name;
    int regno;
    int mark1;
    int mark2;
    int mark3;
    int total;
    int average;

    public void getdata() throws InvalidRegNoException, MarkOutOfBoundsException {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the name :");
        name = scan.nextLine();
        System.out.print("enter the regno :");
        regno = scan.nextInt();
        if (regno > 999999) {
            throw new InvalidRegNoException("the regno is invalid");
        }
        System.out.print("enter the mark1 :");
        mark1 = scan.nextInt();
        if (mark1 > 100) {
            throw new MarkOutOfBoundsException("the mark1 is invalid");
        }
        System.out.print("enter the mark2 :");
        mark2 = scan.nextInt();
        if (mark2 > 100) {
            throw new MarkOutOfBoundsException("the mark2 is invalid");
        }
        System.out.print("enter the mark3 :");
        mark3 = scan.nextInt();
        if (mark3 > 100) {
            throw new MarkOutOfBoundsException("the mark3 is invalid");
        }
        scan.close();
    }

    public void calculate() {
        total = mark1 + mark2 + mark3;
        average = total / 3;
    }

    public void display() {
        System.out.println("the name is :" + name);
        System.out.println("the regno is :" + regno);
        System.out.println("the mark1 is :" + mark1);
        System.out.println("the mark2 is :" + mark2);
        System.out.println("the mark3 is :" + mark3);
    }
}

class exp10 {
    public static void main(String[] args) {
        student obj = new student();
        try {
            obj.getdata();
            obj.calculate();
            obj.display();
        } catch (InvalidRegNoException e) {
            System.out.println("the exception is :" + e);
        } catch (MarkOutOfBoundsException e) {
            System.out.println("the exception is :" + e);
        } finally {
            System.out.println("the program is executed");
        }
    }
}