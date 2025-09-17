import java.util.*;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    List<Employee> employees = new ArrayList<>();

    Department(String name) {
        this.name = name;
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }
}

class Company {
    String name;
    List<Department> departments = new ArrayList<>();

    Company(String name) {
        this.name = name;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showStructure() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            System.out.println("Department: " + d.name);
            for (Employee e : d.employees) {
                System.out.println(" - " + e.name);
            }
        }
    }
}

public class Employee2 {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");
        Department dev = new Department("Development");
        dev.addEmployee(new Employee("Alice"));
        dev.addEmployee(new Employee("Bob"));

        comp.addDepartment(dev);
        comp.showStructure();

        // When company is deleted, all departments & employees are gone
    }
}
