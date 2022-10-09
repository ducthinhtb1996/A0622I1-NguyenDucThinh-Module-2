package company.overriding;

public class Cat extends Animal{
    public Cat() {
        super("Mèo");
    }

    @Override
    public void eat() {
        System.out.println("đang ăn cá");
    }

    @Override
    public void makeSound() {
        System.out.println("meo meo meo");
    }

    @Override
    public void sleep() {
        System.out.println("Khừ khừ khè");
    }
}
