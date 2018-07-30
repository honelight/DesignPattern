package abstractFactory;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if(color.toLowerCase()=="red")
            return new Red();
        else if(color.toLowerCase()=="green")
            return new Green();
        else if(color.toLowerCase()=="blue")
            return new Blue();
        else
            return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
