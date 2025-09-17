package IntroductionOfInheritence.AssistedProblems;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow Meow!");
    }
}

