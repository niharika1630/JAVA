class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area of rectangle");
    }
}

class Square extends Rectangle {
    void feature() {
        System.out.println("Square is a rectangle and a shape");
    }
}

public class Test4 {
    public static void main(String[] args) {
        Square s = new Square();
        s.display();
        s.area();
        s.feature();
    }
}
