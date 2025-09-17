package IntroductionOfInheritance.HybridInheritanceSimulatingMultipleInheritance;

public class Waiter extends Person implements Worker {

    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Waiter) is serving food to customers.");
    }
}

