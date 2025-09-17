package IntroductionOfInheritance.HierarchicalInheritance;

public class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        displayInfo();
        System.out.println("Role: Student, Grade: " + grade);
    }
}
