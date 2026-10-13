import java.util.Scanner;

public class BankingApplication {

    String name;
    String accountNo;
    double balance;

    Scanner sc = new Scanner(System.in);

    void entry() {
        System.out.print("Enter Account Number: ");
        accountNo = sc.nextLine();

        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    void deposit() {
        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();

        balance = balance + amount;
    }

    void withdraw() {
        System.out.print("Enter Withdraw Amount: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void returnbalance() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }

    void closing() {
        System.out.println("Account Closed");
    }

    public static void main(String[] args) {

        BankingApplication bank = new BankingApplication();

        bank.entry();
        bank.deposit();
        bank.withdraw();
        bank.returnbalance();
        bank.closing();
    }
}
