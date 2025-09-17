package IntroductionOfInheritance.HierarchicalInheritance;

public class BankMain {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA101", 15000, 4.5);
        CheckingAccount checking = new CheckingAccount("CA202", 5000, 2000);
        FixedDepositAccount fd = new FixedDepositAccount("FD303", 100000, 24);

        savings.displayAccountType();
        System.out.println("-----------------");
        checking.displayAccountType();
        System.out.println("-----------------");
        fd.displayAccountType();
    }
}

