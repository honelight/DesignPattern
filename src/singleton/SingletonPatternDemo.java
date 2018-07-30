package singleton;

public class SingletonPatternDemo {
    public static void main(String[] args){
        SingleObject object = SingleObject.getInstance();

        object.showMessage();

        SingleObjectLazy lazyObject = SingleObjectLazy.getInstance();

        lazyObject.showMessage();
    }
}
