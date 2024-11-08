import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double IB) {
        balance = IB;
    }
public double getBalance() {
    return balance;
}

    public void deposit(double amount) {
        balance = balance + amount;
    }
public boolean withdraw(double amount) {
        if (amount <= balance) {
               balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4.Exit");
    }
  public void PT() {
    Scanner sc = new Scanner(System.in);
    int choice;
    double amount;

    while (true) {
        displayMenu();
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("your balance is: Rs. " + account.getBalance());
                break;
            case 2:
                System.out.println("Enter the deposit amount: Rs. ");
                amount = sc.nextDouble();
                if (amount > 0) {
                    account.deposit(amount);
                    System.out.println("Deposit successful.");
                } else {
                    System.out.println("Invalid deposit amount.");
                }
                break;
            case 3:
                System.out.println("Enter the withdrawal amount: Rs. ");
                amount = sc.nextDouble();
                if (amount > 0 && account.withdraw(amount)) {
                    System.out.println("Withdrawal successful.");
                } else {
                    System.out.println("Invalid withdrawal amount or insufficient balance.");
                }
                break;
            case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                return;
            default:
                System.out.println("Invalid choice. please try again.");
        }  
    }
}   
}

public class ATM_INTERFACE{
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(100000);
        ATM atm = new ATM(userAccount);
        atm.PT();
    }
}