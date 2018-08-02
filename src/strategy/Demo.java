package strategy;

public class Demo {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        dog.fly();
        cat.fly();
        bird.fly();
    }
}
