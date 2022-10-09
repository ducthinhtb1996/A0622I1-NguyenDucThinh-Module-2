package company.overriding;

public class Dog extends Animal{
    public Dog() {
        super("Dog");
    }

    @Override
    public void eat() {
        System.out.println("đang ăn xương");
    }

    @Override
    public void makeSound() {
        System.out.println("gâu gâu");
    }

    @Override
    public void sleep() {
        System.out.println("khò khò khè");
    }
}
