class SimpleCalculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }
}

public class DemoCalculator {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        System.out.println("sum1: " + calc.add(5, 10));
        System.out.println("sum2: " + calc.add(1.2, 2.3, 3.4));
    }
}
