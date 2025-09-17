package IntroductionOfInheritance.MultilevelInheritance;

public class CourseMain {
    public static void main(String[] args) {
        Course course = new Course("Basic Math", 6);
        OnlineCourse online = new OnlineCourse("Java Programming", 8, "Udemy", true);
        PaidOnlineCourse paid = new PaidOnlineCourse("Data Science", 12, "Coursera", true, 5000, 20);

        course.displayCourse();
        System.out.println("-----------------");
        online.displayCourse();
        System.out.println("-----------------");
        paid.displayCourse();
    }
}

