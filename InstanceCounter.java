class InstanceCounter {
    static int count = 0;

    InstanceCounter() {
        count++;
    }

    static void showCount() {
        System.out.println("Count = " + count);
    }
}

public class DemoInstanceCounter {
    public static void main(String[] args) {
        new InstanceCounter();
        new InstanceCounter();
        InstanceCounter.showCount();
    }
}
