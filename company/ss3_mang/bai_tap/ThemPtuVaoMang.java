package company.ss3_mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPtuVaoMang {
    public static void main(String[] args) {
        int[] myArray;
        myArray = new int[5];
        int n;
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        n = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1));
            myArray[i] = sc.nextInt();
        }
        System.out.println("Mảng bạn vừa nhập : " + Arrays.toString(myArray));

        System.out.println("Hãy nhập vị trí bạn muốn thêm phần tử");
        index = sc.nextInt();
            if (index <=1 || index >=myArray.length-1) {
                System.out.println("Vị trí bạn muốn thêm không cho phép thêm giá trị, vui lòng nhập lại vị trí");
                index = sc.nextInt();
            } else {
                myArray[index] = 10;
            }
        System.out.println("Mảng mới của bạn : " + Arrays.toString(myArray));
    }
}
