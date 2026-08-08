public class ImplementMultipleInheritance {
        interface Friend {
    void eat();
}
interface Pet {
    void play();
}
class Dog implements Friend, Pet {
    public void eat() {
        System.out.println("Dog is eating.");
    }
    public void play() {
        System.out.println("Dog is playing.");
    }
}
public class MultipleInterfaceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.play();
    }
}
}
