package company.Luyen_tap.bai_1;

public class SinhVien {
    private String fullName;
    private String address;
    private String email;
    private String numberPhone;
    private String studentCode;

    public SinhVien() {};

    public SinhVien(String fullName, String address, String email, String numberPhone, String studentCode) {
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.numberPhone = numberPhone;
        this.studentCode = studentCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", studentCode='" + studentCode + '\'' +
                '}';
    }
}