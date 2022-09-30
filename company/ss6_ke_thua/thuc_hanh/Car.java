package company.ss6_ke_thua.thuc_hanh;

public class Car {
    private String hangXe;
    private String dongXe;
    private String mauXe;

    public Car(String hangXe, String dongXe) {};

    public Car(String hangXe, String dongXe, String mauXe) {
        this.hangXe = hangXe;
        this.dongXe = dongXe;
        this.mauXe = mauXe;
    }

    public void tocDo () {
        System.out.println("100km/h");
    }
    public void trangThai () {
        System.out.println("Đang đỗ");
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public String getDongXe() {
        return dongXe;
    }

    public void setDongXe(String dongXe) {
        this.dongXe = dongXe;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

}
