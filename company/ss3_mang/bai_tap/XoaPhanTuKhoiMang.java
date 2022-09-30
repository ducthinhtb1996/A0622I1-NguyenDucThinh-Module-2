package company.ss3_mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] listNumber = {5,6,7,8,9,10,11,12,13,14,15};
//        int[] newListNumber = {};
        int n;
        int index = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử muốn xóa");
        n = sc.nextInt();
        for (int i = 0; i <listNumber.length ; i++) {
            if (n == listNumber[i]) {
                index = i;
                System.out.println("Vị trí của số bạn nhập vào trong mảng là :" + index);
            }
        }
        for (int i = index; i <listNumber.length-1 ; i++) {
            listNumber[i] = listNumber[i+1];
        }
        System.out.println(Arrays.toString(listNumber));
    }
}
