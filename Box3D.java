class Box3D {
    double width, height, depth;

    Box3D() {
        width = height = depth = 1.0;
    }

    Box3D(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

public class DemoBox3D {
    public static void main(String[] args) {
        Box3D b1 = new Box3D();
        Box3D b2 = new Box3D(2.0, 3.0, 4.0);
        System.out.println("Volume b1: " + b1.volume());
        System.out.println("Volume b2: " + b2.volume());
    }
}
