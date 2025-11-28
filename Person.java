class Person {
    void details() {
        System.out.println("Person details");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student studies");
    }
}

class Teacher extends Person {
    void teach() {
        System.out.println("Teacher teaches");
    }
}

public class Test6 {
    public static void main(String[] args) {
        Student s = new Student();
        s.details();
        s.study();

        Teacher t = new Teacher();
        t.details();
        t.teach();
    }
}
