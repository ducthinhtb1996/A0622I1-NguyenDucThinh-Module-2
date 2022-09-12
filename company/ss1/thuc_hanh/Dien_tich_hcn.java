package com.company.ss1.thuc_hanh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Dien_tich_hcn {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số a");
        width = sc.nextFloat();
        System.out.println("Hãy nhập số b");
        height = sc.nextFloat();

        float area = width * height;
        System.out.println("Area is; " + area);
    }
}
