# Experiment 6
## Object Oriented Programming Laboratory
Name: Abinav P

Rollnumber: 22z201


### 1. Create a class Employee with the following details.
**Aim:Create a class Employee with the following details.The data members are name,address, age, gender and the method display() to show employee details.**

```java
import java.util.Scanner;

class Employee{
    String name;
    String address;
    int age;
    char gender;

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
    }
}

class exp6{
    public static void main(String args[]){
        
        Employee e1 = new Employee();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the details of employee 1:");
        System.out.print("Name: ");
        e1.name = scan.nextLine();
        System.out.print("Address: ");
        e1.address = scan.nextLine();
        System.out.print("Age: ");
        e1.age = scan.nextInt();
        System.out.print("Gender: ");
        e1.gender = scan.next().charAt(0);
        e1.display();
        scan.close();
    }
}
```

```java
Enter the details of employee 1:
Name: Abinav
Address: 127.0.0.1
age : 18
Gender: M
```

---

### 2. Create a class with the following details.

**Aim:. Create classes that capture bank customers and bank accounts.A customer has a first and last name.An account has a customer and balance.Make objects for two accounts held by the same customer.**

```java
import java.util.Scanner;

class Customer{
    String firstName;
    String lastName;
}

class Account{
    Customer customer;
    double balance;
}

class exp6{
    public static void main(String args[]){
        Account a1 = new Account();
        Account a2 = new Account();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the details of customer 1:");
        System.out.print("First Name: ");
        a1.customer.firstName = scan.nextLine();
        System.out.print("Last Name: ");
        a1.customer.lastName = scan.nextLine();
        System.out.print("Balance: ");
        a1.balance = scan.nextDouble();

        System.out.println("Enter the details of customer 2:");
        System.out.print("First Name: ");
        a2.customer.firstName = scan.nextLine();
        System.out.print("Last Name: ");
        a2.customer.lastName = scan.nextLine();
        System.out.print("Balance: ");
        a2.balance = scan.nextDouble();

        System.out.println("Customer 1:");
        System.out.println("First Name: "+a1.customer.firstName);
        System.out.println("Last Name: "+a1.customer.lastName);
        System.out.println("Balance: "+a1.balance);

        System.out.println("Customer 2:");
        System.out.println("First Name: "+a2.customer.firstName);
        System.out.println("Last Name: "+a2.customer.lastName);
        System.out.println("Balance: "+a2.balance);
        scan.close();
    }
}
```

```java
Enter the details of customer 1:
First Name: Abinav
Last Name: P
Balance: 1000
Enter the details of customer 2:
First Name: Abinav
Last Name: P
Balance: 1000
Customer 1:
First Name: Abinav
Last Name: P
Balance: 1000.0
Customer 2:
First Name: Abinav
Last Name: P
Balance: 1000.0
```

---

## Result

Thus the programs for creating a class and objects were executed and the output were verified