package abstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.toLowerCase().equals("shape"))
            return new ShapeFactory();
        else if(choice.toLowerCase().equals("color"))
            return new ColorFactory();
        else
            return null;
    }
}
