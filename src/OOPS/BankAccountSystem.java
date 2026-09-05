package OOPS;

public class BankAccountSystem {

    public static class BankAccount {

        private String accountHolder;
        private final int accountNumber;
        private double balance;
        private static int totalAccounts;

        BankAccount(String accountHolder, int accountNumber, double balance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = balance;
            totalAccounts++;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            if (balance >= 0) {
                this.balance = balance;
            } else {
                System.out.println("Balance cannot be negative!");
            }
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Enter a valid amount to deposit!");
            } else {
                balance += amount;
                System.out.println("Amount Credited. Total Balance: " + balance);
            }
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Enter a valid amount to withdraw!");
            } else if (amount > balance) {
                System.out.println("Low Balance! Enter a valid amount.");
            } else {
                balance -= amount;
                System.out.println("Amount Debited. Total Balance: " + balance);
            }
        }

        public void displayAccountInfo() {
            System.out.println("Account Holder's Name: " + accountHolder);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }

        public static int getTotalAccounts() {
            return totalAccounts;
        }
    }

    public static void main(String[] args) {
        BankAccount obj = new BankAccount("SpiderMan", 12345, 5000);
        BankAccount obj2 = new BankAccount("Peter Parker", 23456, 7657);

        obj.displayAccountInfo();
        System.out.println();
        obj2.displayAccountInfo();
        System.out.println();
        obj.withdraw(2000);
        System.out.println();
        obj.deposit(1000);
        System.out.println();

        System.out.println("Total Accounts: " +
                BankAccount.getTotalAccounts());
    }
}