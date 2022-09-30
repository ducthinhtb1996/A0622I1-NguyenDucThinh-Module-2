package company.tryCatch;

import java.util.Scanner;

public class Try_Catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        try {
            System.out.println("Nhập số nguyên n");
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Dữ liệu input không đúng");
        }
    }
}
