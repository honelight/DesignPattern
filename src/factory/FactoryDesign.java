package factory;

interface IVehicle{
    void printVehicle();
}

class TwoWheelerFactory implements IVehicle{
    @Override
    public void printVehicle() {
        System.out.println("I am two wheeler");
    }
}

class FourWheelerFactory implements IVehicle{

    @Override
    public void printVehicle() {
        System.out.println("I am four wheeler");
    }
}

class VehicleFactory{
    public IVehicle getVehicle(int vehicleType){
        if(vehicleType==1){
            return new TwoWheelerFactory();
        }
        else if(vehicleType==2){
            return new FourWheelerFactory();
        }
        else{
            throw new IllegalArgumentException("unacceptable vehicle type");
        }
    }
}

class FactoryClient{
    private IVehicle vehicle;
    private VehicleFactory vehicleFactory;

    public FactoryClient(int vehicleType){
        this.vehicleFactory = new VehicleFactory();
        this.vehicle = vehicleFactory.getVehicle(vehicleType);
    }

    public void printVechicle(){
        this.vehicle.printVehicle();
    }
}

public class FactoryDesign {
    public static void main(String[] args){
        FactoryClient client1 = new FactoryClient(1);
        FactoryClient client2 = new FactoryClient(2);

        client1.printVechicle();
        client2.printVechicle();
    }
}
