package strategy;

public class Cat extends Animal {
    public Cat(){
        super();
        this.setSound("Meow");
        this.setFly(new CantFly());
    }

    public void fly(){
        System.out.println(this.getFly().fly());
    }
}
