package company.ss6_ke_thua.thuc_hanh;

public class ElectricCar extends Car{
    private String tenXe;
    private String giaTien;

    public ElectricCar(String hangXe, String dongXe) {
        super(hangXe, dongXe);
        this.tenXe = tenXe;
        this.giaTien = giaTien;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(String giaTien) {
        this.giaTien = giaTien;
    }

    public void tiengNo () {
        System.out.println("bạch bạch bạch");
    }

}
