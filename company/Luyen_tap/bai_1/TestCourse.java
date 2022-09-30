package company.Luyen_tap.bai_1;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setCourseName("Đắc Nhân Tâm");
        course1.setAuthorName("Nguyễn Đức Thịnh");
        course1.setPrice(5.2);
        System.out.println("Tên Sách : " + course1.getCourseName());
        System.out.println("Tên tác giá : " + course1.getAuthorName());
        System.out.println("Giá bán : " + course1.getPrice() + " $");
    }
}
