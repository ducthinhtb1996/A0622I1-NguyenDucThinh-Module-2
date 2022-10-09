package company.overriding;

public class Animal {
    private String name;

    public Animal() {};

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Ăn thức ăn");
    }
    public void makeSound() {
        System.out.println("Kêu");
    }
    public void sleep() {
        System.out.println("Ngủ khò khò");
    }
}
