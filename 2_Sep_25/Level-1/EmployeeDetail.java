public class EmployeeDetail {
    String name;
    int id;
    double salary;

    public EmployeeDetail(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        EmployeeDetail emp1 = new EmployeeDetail("Ritika", 101, 50000);
        EmployeeDetail emp2 = new EmployeeDetail("Amit", 102, 60000);
        EmployeeDetail emp3 = new EmployeeDetail("Priya", 103, 55000);

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}
