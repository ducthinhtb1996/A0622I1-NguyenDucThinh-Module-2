package com.company.ss1.thuc_hanh;

import java.util.Scanner;

public class Can_nang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight;
        double height;
        double bmi;
        System.out.println("Nhập cân nặng của bạn: ");
        weight = sc.nextFloat();
        System.out.println("Nhập chiều cao của bạn: ");
        height = sc.nextFloat();
        bmi =  weight/Math.pow(height,2);
        if(bmi<18.5) {
            System.out.println("Underweight");
        } else if (18.5<=bmi && bmi < 25) {
            System.out.println("Normal");
        } else if (bmi>=25.0 && bmi <30.0) {
            System.out.println("Overweight");
        } else if (bmi >= 30.0) {
            System.out.println("Obose");
        }
    }
}
