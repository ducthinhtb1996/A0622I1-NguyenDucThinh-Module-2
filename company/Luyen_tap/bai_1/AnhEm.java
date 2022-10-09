package company.Luyen_tap.bai_1;

public class AnhEm extends Student{
    private String numberPhone;

    public AnhEm() {};

    public AnhEm(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public AnhEm(String name, int age, String address, String numberPhone) {
        super(name, age, address);
        this.numberPhone = numberPhone;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

}
