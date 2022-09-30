package company.Luyen_tap.bai_1;

public class TestSchool {
    public static void main(String[] args) {
        School truongInfo = new School();
        truongInfo.setSchoolName("Trường THPT Nguyễn Trãi");
        truongInfo.setShoolAddress("Vũ Thư, Thái Bình");
        truongInfo.setSince(1980);
        System.out.println(truongInfo.getSchoolName() + " Địa chỉ : " + truongInfo.getShoolAddress() + " Thành lập năm : " + truongInfo.getSince());
    }
}
