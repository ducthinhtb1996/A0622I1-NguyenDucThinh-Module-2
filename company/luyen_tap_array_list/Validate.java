package company.luyen_tap_array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Validate implements Vali{

    List<Student> studentList = new ArrayList<Student>();
    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên : " );
        String name = sc.nextLine();
        System.out.println("Nhập tuổi ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ :");
        String address = sc.nextLine();
        Student s = new Student(name, age, address);
        studentList.add(s);
    }

    @Override
    public void display() {
        for (Student o : studentList) {
            System.out.println(o);
        }
    }

    @Override
    public void remove() {

    }

    @Override
    public void edit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên : " );
        String name = sc.nextLine();
        System.out.println("Nhập tuổi ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ :");
        String address = sc.nextLine();
        Student s = new Student(name, age, address);
        studentList.add(s);
    }
}
