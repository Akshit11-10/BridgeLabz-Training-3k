package IntroductionOfInheritance.HybridInheritanceSimulatingMultipleInheritance;

public class VehicleMain {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200);
        PetrolVehicle pv = new PetrolVehicle("Honda Civic", 180);

        ev.displayInfo();
        ev.charge();
        System.out.println("-----------------");
        pv.displayInfo();
        pv.refuel();
    }
}

