package strategy;

public abstract class Animal {
    private double weight;
    private String favFood;
    private double speed;
    private String sound;
    private Fly fly;


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) throws Exception{
        if(weight<0)
            throw new Exception("Weight must be bigger than 0");
        else
            this.weight = weight;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


    public Fly getFly() {
        return fly;
    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }
}
