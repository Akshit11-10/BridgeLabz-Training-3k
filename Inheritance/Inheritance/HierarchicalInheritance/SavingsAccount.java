package IntroductionOfInheritance.HierarchicalInheritance;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        displayDetails();
        System.out.println("Account Type: Savings Account, Interest Rate: " + interestRate + "%");
    }
}

