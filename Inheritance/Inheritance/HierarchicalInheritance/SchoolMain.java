package IntroductionOfInheritance.HierarchicalInheritance;

public class SchoolMain {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Amit Sharma", 40, "Mathematics");
        Student student = new Student("Rahul Mehta", 16, "10th Grade");
        Staff staff = new Staff("Sunita Verma", 35, "Administration");

        teacher.displayRole();
        System.out.println("-----------------");
        student.displayRole();
        System.out.println("-----------------");
        staff.displayRole();
    }
}

