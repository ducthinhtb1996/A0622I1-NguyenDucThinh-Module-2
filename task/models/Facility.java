package task.models;

public abstract class Facility {
    private String tenNoiThat;
    private String namSanXuat;
    private double giaTien;
    private double dienTich;

    public Facility() {};

    public Facility(String tenNoiThat, String namSanXuat, double giaTien, double dienTich) {
        this.tenNoiThat = tenNoiThat;
        this.namSanXuat = namSanXuat;
        this.giaTien = giaTien;
        this.dienTich = dienTich;
    }

    public String getTenNoiThat() {
        return tenNoiThat;
    }

    public void setTenNoiThat(String tenNoiThat) {
        this.tenNoiThat = tenNoiThat;
    }

    public String getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(String namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
}


