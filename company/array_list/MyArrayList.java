package company.array_list;

import company.Luyen_tap.bai_1.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyArrayList {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        Student student1 = new Student("Nguyễn Đức Thịnh 1", 28, "Thái Bình");
        Student student2 = new Student("Nguyễn Đức Thịnh 2", 28, "Thái Bình");
        Student student3 = new Student("Nguyễn Đức Thịnh 3", 28, "Thái Bình");


//        Thêm phần tử vào mảng

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        System.out.println(studentList.size());
        for (int i = 0; i <studentList.size() ; i++) {
            Student std = studentList.get(i);
            System.out.println(std.getName());
        }

//        Xóa phần tử
        studentList.remove(student1);
//        Xóa all
        studentList.clear();
        System.out.println(studentList.size());


    }
}
