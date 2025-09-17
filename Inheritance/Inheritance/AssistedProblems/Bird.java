package IntroductionOfInheritence.AssistedProblems;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps: Tweet Tweet!");
    }
}

