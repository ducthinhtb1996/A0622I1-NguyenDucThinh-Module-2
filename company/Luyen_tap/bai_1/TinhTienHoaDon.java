package company.Luyen_tap.bai_1;

public class TinhTienHoaDon {
    public static void main(String[] args) {
        HoaDonCaPhe hoaDon01 = new HoaDonCaPhe("Trung Nguyên", 120000, 3);
        System.out.println("Số tiền cần thành toán : " + hoaDon01.tinhTongTienHoaDon());
    }
}
