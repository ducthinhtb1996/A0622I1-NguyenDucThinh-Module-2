package company.array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int [] mang1 = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <mang1.length; i++) {
            System.out.println("Nhập phần tử thứ " + i+1);
            mang1[i] = sc.nextInt();
        }
        System.out.println();

    }
}
