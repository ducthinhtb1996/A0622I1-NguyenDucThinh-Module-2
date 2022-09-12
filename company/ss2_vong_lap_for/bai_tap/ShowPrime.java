package company.ss2_vong_lap_for.bai_tap;

public class ShowPrime {
    public static void main(String[] args) {
        for (int i = 2; i <100 ; i++) {
            if (i%1==0 && i%2!=0) {
                System.out.println(i);
            }
        }
    }
}
