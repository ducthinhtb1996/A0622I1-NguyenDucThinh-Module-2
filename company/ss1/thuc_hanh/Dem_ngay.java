package com.company.ss1.thuc_hanh;

import java.util.Scanner;

public class Dem_ngay {
    public static void main(String[] args) {
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thàng bạn muốn đếm số ngày: " );
        month = sc.nextInt();
        if(month <0 || month >12) {
            System.out.println("Nhập tháng từ 1 đến 12");
        }
    }
}
