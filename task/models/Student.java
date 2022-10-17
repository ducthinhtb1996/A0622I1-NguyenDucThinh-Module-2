package task.models;

public class Student extends Person{
    public Student() {
    }

    public Student(String id, String name, int age, String address) {
        super(id, name, age, address);
    }

    @Override
    public void eat() {

    }
}
