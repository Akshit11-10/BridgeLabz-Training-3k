package IntroductionOfInheritance.HierarchicalInheritance;

public class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        displayDetails();
        System.out.println("Account Type: Checking Account, Withdrawal Limit: " + withdrawalLimit);
    }
}

