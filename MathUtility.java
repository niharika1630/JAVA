class MathUtility {
    static int callCount = 0;

    int factorial(int n) {
        callCount++;
        if (n <= 1) return 1;
        else return n * factorial(n - 1);
    }

    int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) result *= base;
        return result;
    }

    double power(double base, double exp) {
        return Math.pow(base, exp);
    }
}

public class DemoMathUtility {
    public static void main(String[] args) {
        MathUtility mu = new MathUtility();

        System.out.println("5! = " + mu.factorial(5));
        System.out.println("2^10 = " + mu.power(2, 10));
        System.out.println("2.5^3 = " + mu.power(2.5, 3.0));
        System.out.println("factorial called: " + MathUtility.callCount + " times");
    }
}
