package IntroductionOfInheritance.HybridInheritanceSimulatingMultipleInheritance;

public class RestaurantMain {
    public static void main(String[] args) {
        Worker chef = new Chef("Ravi", 101);
        Worker waiter = new Waiter("Suman", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}

