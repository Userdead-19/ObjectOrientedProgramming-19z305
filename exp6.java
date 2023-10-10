import java.util.Scanner;

class Employee {
    String name;
    String address;
    int age;
    char gender;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class exp6 {
    public static void main(String args[]) {

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
