import java.util.Scanner;

public class exp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, fact = 1;
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
        sc.close();
    }
}