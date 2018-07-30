package prototype;

public class PrototypePatternDemo {
    public static void main(String[] args){
        ShapeCache.loadCache();

        Shape cloneShape = (Shape)ShapeCache.getShape("1");
        Shape cloneShape2 = (Shape)ShapeCache.getShape("2");
        Shape cloneShape3 = (Shape)ShapeCache.getShape("3");

        cloneShape.draw();
        cloneShape2.draw();
        cloneShape3.draw();

        System.out.println("Shape: "+cloneShape.getType());
        System.out.println("Shape: "+cloneShape2.getType());
        System.out.println("Shape: "+cloneShape3.getType());

    }
}
