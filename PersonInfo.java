class PersonInfo {
    String name;
    int age;

    void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class DemoPersonInfo {
    public static void main(String[] args) {
        PersonInfo p = new PersonInfo();
        p.name = "Alice";
        p.age = 20;
        p.showInfo();
    }
}
