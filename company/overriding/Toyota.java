package company.overriding;

public class Toyota extends Car{
    private String doiXe;

    public Toyota() {
        this.doiXe = doiXe;
    }

    public Toyota(String carName, int namSanXuat, String doiXe) {
        super(carName, namSanXuat);
        this.doiXe = doiXe;
    }

    public String getDoiXe() {
        return doiXe;
    }

    public void setDoiXe(String doiXe) {
        this.doiXe = doiXe;
    }

    @Override
    public void noMay() {
        System.out.println("Ẹc ẹc ẹc ẹc ẹc");
    }

    @Override
    public void doXang() {
        System.out.println("Cần đổ xăng A95");
    }
}
