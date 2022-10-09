package company.ss6_ke_thua.thuc_hanh;

public class Person1 extends Person implements LuyenVo{
    private String name;
    private String address;
    private int age;
    public Person1() {};

    public Person1(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Person1(String fullName, int age, String address, String name, String address1, int age1) {
        super(fullName, age, address);
        this.name = name;
        this.address = address1;
        this.age = age1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    String lamBaiTap() {
        return "Đang làm bài tập";
    }
    @Override
    public void dam() {

    }

    @Override
    public void da() {

    }
}
