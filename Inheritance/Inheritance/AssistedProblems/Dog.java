package IntroductionOfInheritence.AssistedProblems;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof Woof!");
    }
}

