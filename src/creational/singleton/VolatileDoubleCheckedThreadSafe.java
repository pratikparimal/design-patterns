package creational.singleton;

public class VolatileDoubleCheckedThreadSafe {

    private VolatileDoubleCheckedThreadSafe() {}

    private static volatile VolatileDoubleCheckedThreadSafe instance = null;

    public static VolatileDoubleCheckedThreadSafe getInstance() {
        VolatileDoubleCheckedThreadSafe local = instance;
        if (local == null) {
            synchronized (VolatileDoubleCheckedThreadSafe.class) {
                local = instance;
                if (local == null) {
                    instance = new VolatileDoubleCheckedThreadSafe();
                    local = instance;
                }
            }
        }
        return local;
    }
}

class Test5 {
    public static void main(String[] args) {
        VolatileDoubleCheckedThreadSafe obj1 = VolatileDoubleCheckedThreadSafe.getInstance();
        VolatileDoubleCheckedThreadSafe obj2 = VolatileDoubleCheckedThreadSafe.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}