package company.Luyen_tap.bai_1;

public class HoaDonCaPhe {
    private String tenLoaiCaPhe;
    private double giaTien1Kg;
    private double khoiLuong;

    public HoaDonCaPhe() {};

    public HoaDonCaPhe(String tenLoaiCaPhe, double giaTien1Kg, double khoiLuong) {
        this.tenLoaiCaPhe = tenLoaiCaPhe;
        this.giaTien1Kg = giaTien1Kg;
        this.khoiLuong = khoiLuong;
    }

    public double tinhTongTienHoaDon() {
        if (this.khoiLuong >= 2) {
            System.out.println("Bạn được giảm giá 10%");
            return this.giaTien1Kg * this.khoiLuong + 1;
        } else {
            return this.giaTien1Kg * this.khoiLuong;
        }
    }
}
