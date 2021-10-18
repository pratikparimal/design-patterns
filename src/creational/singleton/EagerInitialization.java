package creational.singleton;

public class EagerInitialization {

    private EagerInitialization() {}

    private static final EagerInitialization instance = new EagerInitialization();

    public static EagerInitialization getInstance() {
        return instance;
    }
}

class  Test {
    public static void main(String[] args) {
        EagerInitialization obj1 = EagerInitialization.getInstance();
        EagerInitialization obj2 = EagerInitialization.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}