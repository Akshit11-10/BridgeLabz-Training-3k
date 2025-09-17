package IntroductionOfInheritence.AssistedProblems;

public class AnimalMain {
    public static void main(String[] args) {
        Animal a1 = new Dog("Rocky", 5);
        Animal a2 = new Cat("Whiskers", 3);
        Animal a3 = new Bird("Tweety", 1);

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
