package creational.singleton;

public class LazyInitialization {

    private LazyInitialization() {}

    private static LazyInitialization instance = null;

    public static LazyInitialization getInstance() {
        if (instance == null)
            instance = new LazyInitialization();
        return instance;
    }
}

class  Test2 {
    public static void main(String[] args) {
        LazyInitialization obj1 = LazyInitialization.getInstance();
        LazyInitialization obj2 = LazyInitialization.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
