class LivingThing {
    void live() {
        System.out.println("All living things live");
    }
}

class Animal extends LivingThing {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Test3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.live();
        d.eat();
        d.bark();
    }
}
