package IntroductionOfInheritance.MultilevelInheritance;

public class Course {
    protected String courseName;
    protected int duration; // in weeks

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourse() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}

