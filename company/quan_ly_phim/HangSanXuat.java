package company.quan_ly_phim;

public class HangSanXuat {
    private String tenHang;
    private String quocGia;

    public HangSanXuat () {};

    public HangSanXuat(String tenHang, String quocGia) {
        this.tenHang = tenHang;
        this.quocGia = quocGia;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }
}
