package creational.singleton;

public class ThreadSafe {

    private ThreadSafe() {}

    private static ThreadSafe instance = null;

    public static synchronized ThreadSafe getInstance() {
        if (instance == null)
            instance = new ThreadSafe();
        return instance;
    }
}

class Test3 {
    public static void main(String[] args) {
        ThreadSafe obj1 = ThreadSafe.getInstance();
        ThreadSafe obj2 = ThreadSafe.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
