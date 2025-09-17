
class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void viewBalance(Account account) {
        System.out.println(name + "'s balance in " + account.bank.name + ": $" + account.balance);
    }
}

class Account {
    Bank bank;
    double balance;

    Account(Bank bank, double balance) {
        this.bank = bank;
        this.balance = balance;
    }
}

class Bank {
    String name;

    Bank(String name) {
        this.name = name;
    }

    Account openAccount(Customer c, double initialBalance) {
        System.out.println(c.name + " opened an account in " + name);
        return new Account(this, initialBalance);
    }
}

public class Customer2 {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");
        Customer c1 = new Customer("John");

        Account acc = bank.openAccount(c1, 500);
        c1.viewBalance(acc);
    }
}
