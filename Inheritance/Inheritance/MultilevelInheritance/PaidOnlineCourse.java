package IntroductionOfInheritance.MultilevelInheritance;

public class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayCourse() {
        super.displayCourse();
        double finalPrice = fee - (fee * discount / 100);
        System.out.println("Fee: " + fee + ", Discount: " + discount + "%, Final Price: " + finalPrice);
    }
}

