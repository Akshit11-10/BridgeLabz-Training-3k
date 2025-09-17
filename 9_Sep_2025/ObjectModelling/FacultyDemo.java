import java.util.*;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

class Department2 {
    String name;

    Department2(String name) {
        this.name = name;
    }
}

class University {
    String name;
    List<Department2> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(Department2 d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }
}

public class FacultyDemo {
    public static void main(String[] args) {
        University u = new University("Global University");
        u.addDepartment(new Department2("Computer Science"));
        u.addFaculty(new Faculty("Dr. Smith"));
    }
}
