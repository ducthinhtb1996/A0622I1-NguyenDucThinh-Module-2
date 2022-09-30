package company.Luyen_tap.bai_1;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương");
        n = sc.nextInt();
        if(n<=0) {
            System.out.println("Hãy nhập số nguyên dương");
        } else {
            for (int i = 1; i <n ; i++) {
                if(i%2==0) {
                    total += i;
                }
            }
        }
        System.out.println(total);
    }
}
