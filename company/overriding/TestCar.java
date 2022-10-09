package company.overriding;

public class TestCar {
    public static void main(String[] args) {
        Toyota xe1 = new Toyota();
        xe1.doXang();
        xe1.noMay();
        xe1.setCarName("Toyota Vios");
        System.out.println(xe1.getCarName());
    }
}
