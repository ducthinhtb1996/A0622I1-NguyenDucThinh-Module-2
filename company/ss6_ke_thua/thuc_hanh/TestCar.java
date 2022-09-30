package company.ss6_ke_thua.thuc_hanh;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Cedan", "Xanh");
        car1.tocDo();
        ElectricCar elcCar1 = new ElectricCar("Toyota Rize", "cedan A");
        elcCar1.trangThai();
    }
}
