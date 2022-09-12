package com.company.ss1.bai_tap;


import java.util.Scanner;

public class Chuyen_doi_tien {
    public static void main(String[] args) {
        double rate;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số USD bạn muốn đổi: ");
        usd = sc.nextDouble();
        rate = usd*23000;
        System.out.println("Số tiền đổi là :  " + rate);
    }
}
