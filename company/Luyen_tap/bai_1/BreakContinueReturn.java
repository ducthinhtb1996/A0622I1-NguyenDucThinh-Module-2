package company.Luyen_tap.bai_1;

public class BreakContinueReturn {
    public static void main(String[] args) {
        outLoop:for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <20 ; j++) {
                if(j>10){
                    break outLoop;
                }
                System.out.println(j);
            }
            System.out.println("i = " + i );
        }
    }
}
