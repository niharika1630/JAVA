class StudentRecord {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class DemoStudentRecord {
    public static void main(String[] args) {
        StudentRecord s = new StudentRecord();
        s.setName("Dave");
        s.setAge(22);
        s.showInfo();
    }
}
