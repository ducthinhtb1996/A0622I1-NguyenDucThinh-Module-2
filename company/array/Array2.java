package company.array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        String [] name = new String[] {"Nguyễn Đức Thịnh", "Trần Thu Sương", "Nguyễn Nhật Linh", "Nguyễn Nhật Long"};
        String checkName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên đối chiếu");
        checkName = sc.nextLine();
        for (int i = 0; i <name.length ; i++) {
            if(name[i]==checkName) {
                System.out.println("Tồn tại trong mảng");
            }
        }
    }
}
