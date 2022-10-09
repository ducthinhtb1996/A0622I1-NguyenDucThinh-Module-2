package company.array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        String [] cars = {"Volvo", "Toyota", "BMW", "Ferarri"};
        for (int i = 0; i <cars.length; i++) {
            if(cars[i] == "Volvo") {
                System.out.println("Đã tìm thấy xe Volvo trong list ở vị trí " + i);
            }
        }

    }
}
