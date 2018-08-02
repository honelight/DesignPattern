package strategy;

public class Dog extends Animal {
    public Dog(){
        super();
        this.setSound("Bark");
        this.setFly(new CantFly());
    }

    public void fly(){
        System.out.println(this.getFly().fly());
    }
}
