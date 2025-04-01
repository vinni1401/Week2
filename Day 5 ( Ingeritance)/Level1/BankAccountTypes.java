class BankAccount {
    String accountNumber;
    double balance;
    
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
class SavingsAccount extends BankAccount {
    double interestRate;
    
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    void displayAccountType() {
        System.out.println("This is a Savings Account.");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    
    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    void displayAccountType() {
        System.out.println("This is a Checking Account.");
    }
}

class FixedDepositAccount extends BankAccount {
    int maturityPeriod;
    
    FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }
    void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account.");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 10000, 3.5);
        CheckingAccount ca = new CheckingAccount("CA123", 5000, 2000);
        FixedDepositAccount fda = new FixedDepositAccount("FDA123", 50000, 5);
        
        sa.displayAccountType();
        ca.displayAccountType();
        fda.displayAccountType();
    }
}
