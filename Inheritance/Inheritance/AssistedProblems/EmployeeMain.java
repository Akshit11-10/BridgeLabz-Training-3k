package IntroductionOfInheritence.AssistedProblems;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Manager("Amit", 101, 85000, 10);
        Employee e2 = new Developer("Priya", 102, 65000, "Java");
        Employee e3 = new Intern("Rahul", 103, 15000, "Amit");

        e1.displayDetails();
        System.out.println("-----------------");
        e2.displayDetails();
        System.out.println("-----------------");
        e3.displayDetails();
    }
}

