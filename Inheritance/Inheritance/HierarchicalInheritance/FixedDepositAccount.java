package IntroductionOfInheritance.HierarchicalInheritance;

public class FixedDepositAccount extends BankAccount {
    private int depositTerm; // in months

    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    public void displayAccountType() {
        displayDetails();
        System.out.println("Account Type: Fixed Deposit Account, Deposit Term: " + depositTerm + " months");
    }
}

