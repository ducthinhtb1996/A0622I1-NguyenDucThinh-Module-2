package task.models;

public class Employees extends Person{
    public Employees() {
    }

    public Employees(String id, String name, int age, String address) {
        super(id, name, age, address);
    }

    @Override
    public void eat() {

    }
}
