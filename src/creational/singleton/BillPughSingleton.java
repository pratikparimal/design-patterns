package creational.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {}

    private static class InnerClass {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance() {
        return InnerClass.instance;
    }
}

class Test6 {
    public static void main(String[] args) {
        BillPughSingleton obj1 = BillPughSingleton.getInstance();
        BillPughSingleton obj2 = BillPughSingleton.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}