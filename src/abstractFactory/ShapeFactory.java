package abstractFactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if(shape.toLowerCase()=="square")
            return new Square();
        else if(shape.toLowerCase()=="rectangle")
            return new Rectangle();
        else if(shape.toLowerCase()=="circle")
            return new Circle();
        else
            return null;
    }
}
