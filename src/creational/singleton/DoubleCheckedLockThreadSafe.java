package creational.singleton;

public class DoubleCheckedLockThreadSafe {

    private DoubleCheckedLockThreadSafe() {}

    private static DoubleCheckedLockThreadSafe instance = null;

    public static DoubleCheckedLockThreadSafe getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockThreadSafe.class) {
                if (instance == null)
                    instance = new DoubleCheckedLockThreadSafe();
            }
        }
        return instance;
    }
}

class Test4 {
    public static void main(String[] args) {
        DoubleCheckedLockThreadSafe obj1 = DoubleCheckedLockThreadSafe.getInstance();
        DoubleCheckedLockThreadSafe obj2 = DoubleCheckedLockThreadSafe.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
