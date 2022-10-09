package company.overriding;

public class Car {
    private String carName;
    private int namSanXuat;

    public Car() {};
    public Car(String carName, int namSanXuat) {
        this.carName = carName;
        this.namSanXuat = namSanXuat;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public void noMay() {
        System.out.println("Zỉn zỉn");
    }

    public void doXang() {
        System.out.println("đang đổ xăng");
    }
}
