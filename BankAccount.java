// Superclass: BankAccount
class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public void displayAccountType() {
        System.out.println("General Bank Account");
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = (balance * interestRate) / 100;
        balance += interest;
        System.out.println("Interest added: $" + interest + ". New Balance: $" + balance);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Savings Account");
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Checking Account");
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    private int depositTerm;

    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
        System.out.println("The deposit term is: "+depositTerm);
    }

    public static void main(String[] args) {

        //Creating a general account

        BankAccount account = new BankAccount("11111",70000);
        System.out.println("Account Type:");
        account.displayAccountType();
        account.displayBalance();

        // Creating a Savings Account
        SavingsAccount savings = new SavingsAccount("12345", 50000, 8.0);
        System.out.println("\nAccount Type:");
        savings.displayAccountType();
        savings.displayBalance();
        savings.addInterest();
        System.out.println();


        // Creating a Checking Account
        CheckingAccount checking = new CheckingAccount("67890", 20000);
        System.out.println("Account Type:");
        checking.displayAccountType();
        checking.displayBalance();
        System.out.println();

        // Creating a Fixed Deposit Account
        FixedDepositAccount fd = new FixedDepositAccount("FD123", 10000, 12);
        System.out.println("Account Type:");
        fd.displayAccountType();
        fd.displayBalance();
    }
}
