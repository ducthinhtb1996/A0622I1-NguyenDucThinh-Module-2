package company.Luyen_tap.bai_1;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số nguyên dương");
        n = sc.nextInt();
        do {
            System.out.println("Hãy nhập số nguyên dương");
            n = sc.nextInt();
            for (int i = 0; i <= 20; i++) {
                System.out.println(n*i);
            }
        } while (n<0);
    }

    }
