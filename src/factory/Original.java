package factory;

abstract class Vechicle {
    abstract void printVechicle();
}

class TwoWheeler extends Vechicle{
    @Override
    void printVechicle() {
        System.out.println("I am two wheeler");
    }
}

class FourWheeler extends Vechicle{

    @Override
    void printVechicle() {
        System.out.println("I am four wheeler");
    }
}

class Client{

    private Vechicle pVehicle;

    public Client(int type){
        if(type==1){
            this.pVehicle = new TwoWheeler();
        }
        else if(type==2){
            this.pVehicle = new FourWheeler();
        }
    }

    public void printVechicle(){
        this.pVehicle.printVechicle();
    }
}

public class Original{
    public static void main(String[] args){
        Client client1 = new Client(1);
        Client client2 = new Client(2);

        client1.printVechicle();
        client2.printVechicle();
    }
}
