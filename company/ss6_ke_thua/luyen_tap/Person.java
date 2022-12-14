package company.ss6_ke_thua.luyen_tap;

import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private String birthDay;
    private String address;

    public Person() {};

    public Person(String name, String gender, String birthDay, String address) {
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String inputInfo() {
        String inputData;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập info của bạn");
        inputData = sc.nextLine();
        return inputData;
    }
}
