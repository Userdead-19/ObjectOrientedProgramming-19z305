//2.
// public interface MyInterface {
//     void myMethod();
// }

// public class Main {
//     public static void main(String[] args) {
//         MyInterface obj = new MyInterface(); // This will result in a compilation error
//     }
// }

// Single inheritance using interface

// interface MyInterface {
//     void myMethod();
// }

// public class exp91 implements MyInterface {
//     public void myMethod() {
//         System.out.println("Some text..");
//     }

//     public static void main(String[] args) {
//         exp91 obj = new exp91();
//         obj.myMethod();
//     }
// }

// interface CNG_car {
//     void drive();
// }

// interface Petrol_car {
//     void drive();
// }

// class hybrid_Car {
//     int mileage;

//     public void drive() {
//         System.out.println("driving");
//     }

//     public void cngkit() {
//         System.out.println("cngkit");
//     }

//     public void petrolkit() {
//         System.out.println("petrolkit");
//     }

// }

// public class exp91 extends hybrid_Car implements CNG_car, Petrol_car {
//     public void drive() {
//         System.out.println("driving");
//     }

//     public static void main(String[] args) {
//         exp91 obj = new exp91();
//         obj.drive();
//         obj.cngkit();
//         obj.petrolkit();
//     }
// }

//Design an interface named Stack with the following methods
// Check whether the stack is empty or not. Implement the stack with the help of arrays and if
// the size of the array becomes too small to hold the elements, create a new one. Test this interface by
// inheriting it in its subclass StackTest.java.

interface Stack {
    void push(int element);

    int pop();

    boolean isEmpty();
}

class StackTest implements Stack {
    int[] arr = new int[10];
    int top = -1;

    public void push(int element) {
        if (top == arr.length - 1) {
            int[] arr2 = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        arr[++top] = element;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("stack is empty");
            return -1;
        }
        return arr[top--];
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        StackTest obj = new StackTest();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.pop();
    }
}