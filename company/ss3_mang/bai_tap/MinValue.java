package company.ss3_mang.bai_tap;

public class MinValue {
    public static void main(String[] args) {
        int[] listNumber = {1,3,5,2,7,8,3,0,10,-1};
        int min = listNumber[0];
        for (int i = 0; i <listNumber.length ; i++) {
            if (listNumber[i] <= min) {
                min = listNumber[i];
            }
        }
        System.out.println(min);
    }
}
