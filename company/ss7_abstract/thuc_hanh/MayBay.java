package company.ss7_abstract.thuc_hanh;

public class MayBay extends PhuongTienDiChuyen {
    private String loaiNhienLieu;

    public MayBay () {};

    public MayBay(String tenLoaiPhuongTien, HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super(tenLoaiPhuongTien, hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }
}
