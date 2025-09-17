package IntroductionOfInheritance.HierarchicalInheritance;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        displayInfo();
        System.out.println("Role: Teacher, Subject: " + subject);
    }
}

