import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;


    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    
    void deposit(double amount) {
        balance = balance + amount;
    }

     
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    
    double checkBalance() {
        return balance;
    }

    
    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int no = sc.nextInt();

        System.out.print("Enter account holder name: ");
        String name = sc.next();

        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();

        BankAccount b = new BankAccount(no, name, bal);

        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        b.deposit(dep);

        System.out.print("Enter withdrawal amount: ");
        double wit = sc.nextDouble();
        b.withdraw(wit);

        System.out.println("\nFinal Account Details:");
        b.displayAccount();

        sc.close();
    }
}