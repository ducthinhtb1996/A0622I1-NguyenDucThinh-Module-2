package company.quan_ly_phim;

public class testPhim {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(15, 10, 2022);
        Ngay ngay2 = new Ngay(16, 11, 2023);
        Ngay ngay3 = new Ngay(17, 12, 2024);

        HangSanXuat hang1 = new HangSanXuat("Toyota 1", "Việt Nam 1" );
        HangSanXuat hang2 = new HangSanXuat("Toyota 2", "Việt Nam 2" );
        HangSanXuat hang3 = new HangSanXuat("Toyota 3", "Việt Nam 3" );


        Phim phim1 = new Phim("Bố yêu các con", ngay1, hang1, 5.50, ngay2);
        Phim phim2 = new Phim("Bố yêu các con", ngay2, hang2, 8.50, ngay1);

        System.out.println("Tên hãng của bộ phim 2 là " + hang2.getTenHang());
        System.out.println(phim2.kiemTraGiaVeReHon(phim1));
    }
}
