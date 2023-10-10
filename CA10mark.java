// import java.util.Scanner;

// abstract class BankAccount {
//     private String name;
//     private int accountNumber;
//     private String address;

//     public BankAccount(String name, int accountNumber, String address) {
//         this.name = name;
//         this.accountNumber = accountNumber;
//         this.address = address;
//     }

//     public String getName() {
//         return this.name;
//     }

//     public int getAccountNumber() {
//         return this.accountNumber;
//     }

//     public String getAddress() {
//         return this.address;
//     }

//     public abstract void withdraw(double amount);

//     public abstract void deposit(double amount);

//     public abstract void display();
// }

// class SavingsAccount extends BankAccount {
//     private double returnOnInvestment;

//     public SavingsAccount(String name, int accountNumber, String address, double returnOnInvestment) {
//         super(name, accountNumber, address);
//         this.returnOnInvestment = returnOnInvestment;
//     }

//     public double getReturnOnInvestment() {
//         return this.returnOnInvestment;
//     }

//     public void setReturnOnInvestment(double returnOnInvestment) {
//         this.returnOnInvestment = returnOnInvestment;
//     }

//     @Override
//     public void withdraw(double amount) {
//         System.out.println("Withdrawn amount: " + amount);
//     }

//     @Override
//     public void deposit(double amount) {
//         System.out.println("Deposited amount: " + amount);
//     }

//     @Override
//     public void display() {
//         System.out.println("Name: " + this.getName());
//         System.out.println("Account Number: " + this.getAccountNumber());
//         System.out.println("Address: " + this.getAddress());
//         System.out.println("Return on Investment: " + this.getReturnOnInvestment());
//     }

//     public double calcCAmt(double amount) {
//         return amount + (amount * this.returnOnInvestment);
//     }
// }

// public class CA10mark {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);

//         System.out.print("Enter the name: ");
//         String name = in.nextLine();

//         System.out.print("Enter the account number: ");
//         int accountNumber = in.nextInt();

//         in.nextLine();

//         System.out.print("Enter the address: ");
//         String address = in.nextLine();

//         System.out.print("Enter the return on investment: ");
//         double returnOnInvestment = in.nextDouble();

//         SavingsAccount savingsAccount = new SavingsAccount(name, accountNumber, address, returnOnInvestment);

//         System.out.print("Enter the amount to deposit: ");
//         double amount = in.nextDouble();
//         savingsAccount.deposit(amount);

//         System.out.print("Enter the amount to withdraw: ");
//         amount = in.nextDouble();
//         savingsAccount.withdraw(amount);

//         System.out.println("Balance after 1 year: " + savingsAccount.calcCAmt(amount));

//         in.close();
//     }
// }

// create a class Employee with the following details. The data members are name
// address, age, genderand the method display() to show employee details. Create another
// class FulIT imeEmployée that inherits Employee class. The data members in this class are
// salary and designation. Create another class PartTimeEmployee that inherits Employee
// class. The data members are working hours, rate per hour and the method CalculatePay()
// to calculate the amountpayable and display() to show amountpayable along with other
// details. Create objects of these classes and call their methods. Use appropriate
// constructors.

import java.util.Scanner;

class Employee {

    String name;
    String address;
    int age;
    String gender;

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + gender);
    }
}

class FullTimeEmployee extends Employee {
    double salary;
    String designation;

    void display() {
        super.display();
        System.out.println("Salary: " + this.salary);
        System.out.println("Designation: " + this.designation);
    }
}

class PartTimeEmployee extends Employee {
    int workingHours;
    double ratePerHour;

    void display() {
        super.display();
        System.out.println("Working Hours: " + this.workingHours);
        System.out.println("Rate per Hour: " + this.ratePerHour);
    }

    double calculatePay() {
        return this.workingHours * this.ratePerHour;
    }
}

/**
 * CA10mark
 */
public class CA10mark {
    public static void main(String[] args) {

    }

}