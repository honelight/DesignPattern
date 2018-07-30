package singleton;

public class SingleObjectLazy {
    private static SingleObjectLazy instance;

    private SingleObjectLazy(){}

    public static SingleObjectLazy getInstance(){
        if(instance==null)
            instance = new SingleObjectLazy();
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
