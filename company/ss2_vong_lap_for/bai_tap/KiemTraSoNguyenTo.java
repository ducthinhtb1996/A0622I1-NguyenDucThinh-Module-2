package company.ss2_vong_lap_for.bai_tap;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        System.out.println("First 20 primes");
        int count = 0,number =2;
        while (count<=20){
            if (isPrime(number)){
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
    static boolean isPrime(int number){
        for (int i = 2; i <=Math.sqrt(number) ; i++) {
            if (number%i == 0){
                return false;
            }
        }
        return true;
    }
}
