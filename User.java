class User {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class DemoUser {
    public static void main(String[] args) {
        User user1 = new User("Bob", 25);
        User user2 = new User("Carol", 30);
        user1.showInfo();
        user2.showInfo();
    }
}
