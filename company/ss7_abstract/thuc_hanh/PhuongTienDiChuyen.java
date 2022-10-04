package company.ss7_abstract.thuc_hanh;

public abstract class PhuongTienDiChuyen {
    protected String tenLoaiPhuongTien;
    protected HangSanXuat hangSanXuat;

//    Contructor
    public PhuongTienDiChuyen() {};
    public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

//    Setter & getter

    public String getTenLoaiPhuongTien() {
        return tenLoaiPhuongTien;
    }

    public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

//    Khởi tạo phương thức
    public String layTenHangSanXuat() {
        return this.hangSanXuat.getTenHangSanXuat();
    }

    public void khoiDong() {
        System.out.println("Start...");
    }

    public void tangToc() {
        System.out.println("1000km/h");
    }

    public void tatMay () {
        System.out.println("Đã dừng lại");
    }

}
