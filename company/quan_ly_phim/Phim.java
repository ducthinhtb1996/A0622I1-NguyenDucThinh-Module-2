package company.quan_ly_phim;

public class Phim {
    private String tenPhim;
    private Ngay ngaySanXuat;
    private HangSanXuat hangSanXuat;
    private double giaVe;
    private Ngay ngayChieuPhim;

    public Phim() {
    }

    ;

    public Phim(String tenPhim, Ngay ngaySanXuat, HangSanXuat hangSanXuat, double giaVe, Ngay ngayChieuPhim) {
        this.tenPhim = tenPhim;
        this.ngaySanXuat = ngaySanXuat;
        this.hangSanXuat = hangSanXuat;
        this.giaVe = giaVe;
        this.ngayChieuPhim = ngayChieuPhim;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public Ngay getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Ngay ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public Ngay getNgayChieuPhim() {
        return ngayChieuPhim;
    }

    public void setNgayChieuPhim(Ngay ngayChieuPhim) {
        this.ngayChieuPhim = ngayChieuPhim;
    }

    public String getHangSanXuatPhim() {
        return this.hangSanXuat.getTenHang();
    }

    public boolean kiemTraGiaVeReHon(Phim phimKhac) {
      return this.giaVe < phimKhac.giaVe;
    }
}