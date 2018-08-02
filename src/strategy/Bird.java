package strategy;

public class Bird extends Animal {
    public Bird(){
        super();
        this.setSound("Tweet");
        this.setFly(new ItFlys());
    }

    public void fly(){
        System.out.println(this.getFly().fly());
    }
}
