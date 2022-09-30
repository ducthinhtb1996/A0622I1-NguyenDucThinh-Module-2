package company.ss6_ke_thua.thuc_hanh;

public class Student extends Person{
    private String className;
    private String studentId;

    public Student(String className, String studentId) {
        this.className = className;
        this.studentId = studentId;
    }

    public Student(String fullName, int age, String address, String className, String studentId) {
        super(fullName, age, address);
        this.className = className;
        this.studentId = studentId;
    }
}
