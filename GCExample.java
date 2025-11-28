class GCExample {
    int id;
    GCExample(int id) {
        this.id = id;
        System.out.println("Created object " + id);
    }

    @Override
    protected void finalize() {
        System.out.println("Finalizing object " + id);
    }
}

public class DemoGCExample {
    public static void main(String[] args) {
        GCExample obj1 = new GCExample(1);
        GCExample obj2 = new GCExample(2);

        obj1 = null;
        obj2 = null;

        System.gc();
        System.out.println("End of main");
    }
}
