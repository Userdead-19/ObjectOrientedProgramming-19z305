// //abstract class
// abstract class Accounts {
//     float balance;
//     String accountNumber;
//     String accountHolderName;
//     String address;

//     Accounts(float balance, String accountNumber, String accountHolderName,
//             String address) {
//         this.balance = balance;
//         this.accountNumber = accountNumber;
//         this.accountHolderName = accountHolderName;
//         this.address = address;
//     }

//     abstract void deposit(float amount);

//     abstract void withdraw(float amount);

//     abstract void display();
// }

// class SavingsAccount extends Accounts {
//     float interestRate;

//     SavingsAccount(float balance, String accountNumber, String accountHolderName,
//             String address, float interestRate) {
//         super(balance, accountNumber, accountHolderName, address);
//         this.interestRate = interestRate;
//     }

//     void deposit(float amount) {
//         balance += amount;
//     }

//     void withdraw(float amount) {
//         balance -= amount;
//     }

//     void display() {
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Account Holder Name: " + accountHolderName);
//         System.out.println("Address: " + address);
//         System.out.println("Balance: " + balance);
//         System.out.println("Interest Rate: " + interestRate);
//     }
// }

// public class exp8 {
//     public static void main(String[] args) {
//         SavingsAccount s1 = new SavingsAccount(10000, "123456789", "Rahul", "Mumbai",
//                 5);
//         s1.display();
//         s1.deposit(1000);
//         s1.display();
//         s1.withdraw(500);
//         s1.display();

//     }

// }

abstract class LibraryManagement {
    String bookName;

    LibraryManagement(String bookName) {
        this.bookName = bookName;
    }

    abstract void displayBookNames();

    abstract String getBookName();
}

class Issue extends LibraryManagement {
    int count;

    Issue(String bookName, int count) {
        super(bookName);
        this.count = count;
    }

    void decrement() {
        count--;
    }

    void displayBookNames() {
        System.out.println("Book Name: " + bookName);
    }

    String getBookName() {
        return bookName;
    }
}

class Return extends LibraryManagement {
    int count;

    Return(String bookName, int count) {
        super(bookName);
        this.count = count;
    }

    void increment() {
        count++;
    }

    void displayBookNames() {
        System.out.println("Book Name: " + bookName);
    }

    String getBookName() {
        return bookName;
    }
}

class Search {
    static boolean searchBook(String bookName, LibraryManagement[] books) {
        for (LibraryManagement book : books) {
            if (book.getBookName().equals(bookName)) {
                return true;
            }
        }
        return false;
    }
}

public class exp8 {
    public static void main(String[] args) {
        LibraryManagement[] books = new LibraryManagement[3];
        books[0] = new Issue("Book1", 5);
        books[1] = new Issue("Book2", 3);
        books[2] = new Return("Book3", 2);

        System.out.println("Books available in the library:");
        for (LibraryManagement book : books) {
            book.displayBookNames();
        }

        String bookName = "Book1";
        if (Search.searchBook(bookName, books)) {
            System.out.println("Book found: " + bookName);
            Issue issueBook = (Issue) books[0];
            issueBook.decrement();
            System.out.println("Book issued: " + bookName);
        } else {
            System.out.println("Book not found: " + bookName);
        }

        bookName = "Book3";
        if (Search.searchBook(bookName, books)) {
            System.out.println("Book found: " + bookName);
            Return returnBook = (Return) books[2];
            returnBook.increment();
            System.out.println("Book returned: " + bookName);
        } else {
            System.out.println("Book not found: " + bookName);
        }
    }
}
