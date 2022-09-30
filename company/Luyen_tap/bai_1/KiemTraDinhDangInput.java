package company.Luyen_tap.bai_1;

import java.util.Scanner;

public class KiemTraDinhDangInput {
    public static void main(String[] args) {
        String[] MSSV = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Nhập vào MSSV thứ " + (i+1) + ":");
            MSSV[i] = sc.nextLine();
        }

        for (int i = 0; i < 5; i++)
        {
            if (!MSSV[i].matches("B170[1-9]{4}"))
                System.out.println("MSSV thứ " + (i+1) + " sai định dạng!");
        }
    }

    }
