class Box {
    double width, height, depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class BoxTransformer {
    static Box scale(Box b, double factor) {
        return new Box(b.width * factor, b.height * factor, b.depth * factor);
    }
}

public class DemoBoxTransformer {
    public static void main(String[] args) {
        Box original = new Box(2.0, 3.0, 4.0);
        Box scaled = BoxTransformer.scale(original, 2.0);
        System.out.println("Original volume: " + (original.width * original.height * original.depth));
        System.out.println("Scaled volume: " + (scaled.width * scaled.height * scaled.depth));
    }
}
