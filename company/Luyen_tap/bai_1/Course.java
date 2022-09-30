package company.Luyen_tap.bai_1;

public class Course {
    private String courseName;
    private String authorName;
    private double price;

    public Course() {};

//    public Course (String courseName, String authorName, double price) {
//        this.courseName = courseName;
//        this.authorName = authorName;
//        this.price = price;
//    }

    public Course(String courseName, String authorName, double price) {
        this.courseName = courseName;
        this.authorName = authorName;
        this.price = price;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
