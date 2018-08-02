package strategy;

public interface Fly {
    public String fly();
}

class ItFlys implements Fly{
    @Override
    public String fly() {
        return "Flying";
    }
}

class CantFly implements Fly{
    @Override
    public String fly() {
        return "Can't fly";
    }
}
