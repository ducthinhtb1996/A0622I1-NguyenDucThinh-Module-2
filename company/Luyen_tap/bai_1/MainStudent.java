package company.Luyen_tap.bai_1;

public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Nguyễn Đức Thịnh", 28, "Thái Bình");
        student1.setName("Nguyễn Nhật Long");
        AnhEm anhEm = new AnhEm("0123456789");
        System.out.println(student1.toString());
    }
}
