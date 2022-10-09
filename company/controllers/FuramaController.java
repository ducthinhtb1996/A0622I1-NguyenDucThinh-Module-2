package company.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu() {
        System.out.println("1. Employee Managerment");
        System.out.println("2. Customer Managerment");
        System.out.println("3. Facility Managerment");
        System.out.println("4. Booking Managerment");
        System.out.println("5. Promotion Managerment");
        System.out.println("6. Exit");

        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy chọn một trong các option");

        boolean checkValue = true;
        while (checkValue) {
            switch (sc.nextInt()) {
                case 1: {
                    selectedOne();
                    break;
                }
                case 2: {
                    selectedTwo();
                    break;
                }
                case 3: {
                    selectedThree();
                    break;
                }
                case 4: {
                    selectedFour();
                    break;
                }
                case 5: {
                    selectedFive();
                    break;
                }
                case 6: {
                    selectedSix();
                    break;
                }
                default: {
                    System.out.println("Hãy nhập giá trị từ 1 đến 6");
                    break;
                }
            }
        }
    }
    // Chọn option 1
    public static void selectedOne() {
        boolean checkValue = true;
        while (checkValue) {
            System.out.println("1. DisPlay list employee");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1: {
                    System.out.println("Bạn đã chọn số 1");
                    break;
                }
            }
        }
    }
    // Chọn option 2
    public static void selectedTwo () {
        boolean checkValue = true;
        while (checkValue) {
            System.out.println("1. DisPlay list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1: {

                }
            }
        }
    }
    // Chọn option 3
    public static void selectedThree () {
        boolean checkValue = true;
        while (checkValue) {
            System.out.println("1. DisPlay list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1: {
                }
            }
        }
    }
    // Chọn option 4
    public static void selectedFour () {
        boolean checkValue = true;
        while (checkValue) {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contacts");
            System.out.println("4. Edit contacts");
            System.out.println("5. Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1: {
                }
            }
        }
    }
    // Chọn option 5
    public static void selectedFive () {
        boolean checkValue = true;
        while (checkValue) {
            System.out.println("1. DisPlay list customer user service");
            System.out.println("2. DisPlay list customer get voucher");
            System.out.println("3. Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1: {
                }
            }
        }
    }
    // Chọn option 6
    public static void selectedSix () {
        boolean checkValue = true;
        while (checkValue) {
            System.out.println("Đã kết thúc chương trình");
            break;
        }
    }
}
