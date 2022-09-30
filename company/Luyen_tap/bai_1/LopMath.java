package company.Luyen_tap.bai_1;

import java.util.Scanner;

public class LopMath {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a:");
        a = sc.nextInt();
        System.out.println("Nhập số b:");
        b = sc.nextInt();

//        Hàm giá trị tuyệt đối
        System.out.println("|a| = " + Math.abs(a));

//        Hàm Max Min
        System.out.println("Max = " + Math.max(a,b));
        System.out.println("Min = " + Math.min(a,b));

//        Hàm tính số mũ
        System.out.println("Căn bậc b = " + Math.pow(a,b));

//        Hàm làm tròn
        System.out.println("Làm tròn của a là:" + Math.round(a));
        System.out.println("Làm tròn của b là:" + Math.round(b));
    }
}
