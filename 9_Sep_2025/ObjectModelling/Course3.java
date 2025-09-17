import java.util.*;

class Course {
    String name;
    List<Student> enrolled = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void enroll(Student s) {
        enrolled.add(s);
    }

    void showStudents() {
        System.out.println("Students in " + name + ":");
        for (Student s : enrolled)
            System.out.println(" - " + s.name);
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        courses.add(c);
        c.enroll(this);
    }

    void showCourses() {
        System.out.println(name + "'s courses:");
        for (Course c : courses)
            System.out.println(" - " + c.name);
    }
}

class School {
    String name;
    List<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }
}

public class Course3 {
    public static void main(String[] args) {
        School sch = new School("City School");
        Student s1 = new Student("John");
        Course math = new Course("Math");
        Course sci = new Course("Science");

        sch.addStudent(s1);
        s1.enrollCourse(math);
        s1.enrollCourse(sci);

        s1.showCourses();
        math.showStudents();
    }
}
