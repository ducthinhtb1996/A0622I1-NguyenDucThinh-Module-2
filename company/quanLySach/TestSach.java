package company.quanLySach;

public class TestSach {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(01, 10, 2022);
        Ngay ngay2 = new Ngay(02, 10, 2022);
        Ngay ngay3 = new Ngay(03, 10, 2022);
        TacGia tacGia1 = new TacGia("Nguyễn Đức Thịnh 1", ngay1);
        TacGia tacGia2 = new TacGia("Nguyễn Đức Thịnh 2", ngay2);
        TacGia tacGia3 = new TacGia("Nguyễn Đức Thịnh 3", ngay3);
        Sach sach1 = new Sach("Điều bạn nên biết 1", 5.18, 2019, tacGia1);
        Sach sach2 = new Sach("Điều bạn nên biết 2", 5.18, 2019, tacGia1);
        Sach sach3 = new Sach("Điều bạn nên biết 3", 5.18, 2019, tacGia1);
        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();
    }

}
