package creational.singleton;

public class StaticBlockEagerInitialization {

    private StaticBlockEagerInitialization() {}

    private static final StaticBlockEagerInitialization instance;

    static {
        try {
            instance = new StaticBlockEagerInitialization();
        } catch (Exception e) {
            throw new RuntimeException("Exception while creating Singleton object");
        }
    }
    public static StaticBlockEagerInitialization getInstance() {
        return instance;
    }
}

class  Test1 {
    public static void main(String[] args) {
        StaticBlockEagerInitialization obj1 = StaticBlockEagerInitialization.getInstance();
        StaticBlockEagerInitialization obj2 = StaticBlockEagerInitialization.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
