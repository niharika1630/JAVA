class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void run() {
        System.out.println("Car is running");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.run();
    }
}
