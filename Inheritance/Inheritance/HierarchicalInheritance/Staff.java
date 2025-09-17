package IntroductionOfInheritance.HierarchicalInheritance;

public class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        displayInfo();
        System.out.println("Role: Staff, Department: " + department);
    }
}

