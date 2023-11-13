# Experiment 9 A
## Object Oriented Programming Laboratory
Name: Abinav P

Rollnumber: 22z201


###  2. Interface, in many way, similar to a class; however, no object can be instantiated from an interface. Demonstrate it.

```java 

public interface MyInterface {
    void myMethod();
}

public class Main {
    public static void main(String[] args) {
        MyInterface obj = new MyInterface(); // This will result in a compilation error
    }
}

```

### Output
```shell
$ javac Main.java
Main.java:7: error: MyInterface is abstract; cannot be instantiated
        MyInterface obj = new MyInterface(); // This will result in a compilation error
                            ^
1 error
```

### 3. Inheritance in Interfaces:
### Like classes, interfaces also have a chain of inheritance i.e. an interface can be derived from other interface. Implement single inheritance with interface

```java
interface MyInterface {
    void myMethod();
}

public class exp91 implements MyInterface {
    public void myMethod() {
        System.out.println("Some text..");
    }

    public static void main(String[] args) {
        exp91 obj = new exp91();
        obj.myMethod();
    }
}
```
### output
```shell
$ javac exp91.java
$ java exp91
Some text..

```

### 4. Illustrate class A which &quot;implements&quot; two interfaces ( I1 and I2)

```java
interface I1 {
    void myMethod1();
}

interface I2 {
    void myMethod2();
}

public class A implements I1, I2 {
    public void myMethod1() {
        System.out.println("Some text..");
    }

    public void myMethod2() {
        System.out.println("Some other text...");
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.myMethod1();
        obj.myMethod2();
    }
}
```

### Output
```shell
$ javac A.java
$ java A
Some text..
Some other text...
```

### 5.Use two interfaces and implement the drive() method in Hybrid_Car class

```java 

interface CNG_car {
    void drive();
}

interface Petrol_car {
    void drive();
}

class hybrid_Car {
    int mileage;

    public void drive() {
        System.out.println("driving");
    }

    public void cngkit() {
        System.out.println("cngkit");
    }

    public void petrolkit() {
        System.out.println("petrolkit");
    }

}

public class exp91 extends hybrid_Car implements CNG_car, Petrol_car {
    public void drive() {
        System.out.println("driving");
    }

    public static void main(String[] args) {
        exp91 obj = new exp91();
        obj.drive();
        obj.cngkit();
        obj.petrolkit();
    }
}```

### Output
```shell

$ javac exp91.java
$ java exp91
driving
cngkit
petrolkit
```

### 6. Design an interface named Stack with the following methods:

```java
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
}```

### Output
```shell
$ javac StackTest.java
$ java StackTest
```
