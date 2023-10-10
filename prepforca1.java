// /*Create classes that capture bank customers and bank accounts. A customer
// has a first and
// last name.An account has a customer and a balance. Make objects for two
// accounts held
// by the same customer.*/

// import java.util.Scanner;

// class Customer {
// private String firstName;
// private String lastName;

// public Customer(String firstName, String lastName) {
// this.firstName = firstName;
// this.lastName = lastName;
// }

// public String getFirstName() {
// return this.firstName;
// }

// public String getLastName() {
// return this.lastName;
// }
// }

// class Account {
// private Customer customer;
// private double balance;

// public Account(Customer customer, double balance) {
// this.customer = customer;
// this.balance = balance;
// }

// public Customer getCustomer() {
// return this.customer;
// }

// public double getBalance() {
// return this.balance;
// }

// public void setBalance(double balance) {
// this.balance = balance;
// }

// public void deposit(double amount) {
// this.balance += amount;
// }

// public void withdraw(double amount) {
// if (this.balance >= amount) {
// this.balance -= amount;
// } else {
// System.out.println("Amount withdrawn exceeds the current balance!");
// }
// }
// }

// public class prepforca1 {
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);

// System.out.print("Enter the first name of the customer: ");
// String firstName = in.nextLine();

// System.out.print("Enter the last name of the customer: ");
// String lastName = in.nextLine();

// System.out.print("Enter the initial balance: ");
// double balance = in.nextDouble();

// Customer customer = new Customer(firstName, lastName);
// Account account = new Account(customer, balance);

// System.out.println(
// "Customer: " + account.getCustomer().getFirstName() + " " +
// account.getCustomer().getLastName());
// System.out.println("Balance: " + account.getBalance());

// System.out.print("Enter the amount to deposit: ");
// double amount = in.nextDouble();
// account.deposit(amount);

// System.out.println("Balance: " + account.getBalance());

// System.out.print("Enter the amount to withdraw: ");
// amount = in.nextDouble();
// account.withdraw(amount);

// System.out.println("Balance: " + account.getBalance());
// in.close();
// }
// }

// give me an example for class

// class Student {

// private String name;

// public Student(String name) {
// this.name = name;
// }

// public String getName() {
// return this.name;
// }

// }

// public class prepforca1 {
// public static void main(String[] args) {
// Student student = new Student("John");
// System.out.println(student.getName());
// }
// }

// give me an example for object

// //give me an example for inheritance

// class Animal {
// public void eat() {
// System.out.println("Animal is eating");
// }
// }

// class Dog extends Animal {
// public void bark() {
// System.out.println("Dog is barking");
// }
// }

// public class prepforca1 {
// public static void main(String[] args) {
// Dog dog = new Dog();
// dog.eat();
// dog.bark();
// }
// }

// give me an example for polymorphism

// class Animal {
// public void eat() {
// System.out.println("Animal is eating");
// }
// }

// class Dog extends Animal {
// @Override
// public void eat() {
// System.out.println("Dog is eating");
// }
// }

// public class prepforca1 {
// public static void main(String[] args) {
// Dog animal = new Dog();
// animal.eat();
// }
// }

// // give me an example for encapsulation

// class Student {

// private String name;

// public Student(String name) {
// this.name = name;
// }

// public String getName() {
// return this.name;
// }

// }

// public class prepforca1 {
// public static void main(String[] args) {
// Student student = new Student("John");
// System.out.println(student.getName());
// }
// }

// example for methodoverloading

// class Student{
// public void print(String name){
// System.out.println("Name: " + name);
// }
// public void print(String name, int age){
// System.out.println("Name: " + name + " Age: " + age);
// }
// }

// public class prepforca1{
// public static void main(String[] args){
// Student student = new Student();
// student.print("John");
// student.print("John", 20);
// }
// }

// class to represent a bank account with datamembers name, account number
// address and
// abstract methods withdraw and
// deposit. Method display() is needed to show
// balance. Create a subclass SavingsAccount and
// add the following details: return on
// investment
// and the method calcCAmt() to show the amount in the account after 1 year.
// Create object of the SavingsAccount class , deposit and withdraw user
// specified amount
// from the savings account and finally display the balance after 1 year with
// interest.

//2 d array

/**
 * prepforca1
 */
class hello {
    private int num = 5;
}

class hello1 extends hello {
    void display() {
        System.out.println(num);
    }
}

public class prepforca1 {

    public static void main(String[] args) {
        hello1 h1 = new hello1();

    }
}