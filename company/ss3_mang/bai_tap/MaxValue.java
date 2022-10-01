package company.ss3_mang.bai_tap;

public class MaxValue {
    public static void main(String[] args) {
        int[] list1 = {1,2,3,1,5,8,29};
        int[] list2 = {8,20,15,19,27,18};
        int max = 0;
        for (int i = 0; i <list1.length ; i++) {
            for (int j = 0; j <list2.length ; j++) {
                if (list1[i] > list2[j]) {
                    max = list1[i];
                } else {
                    max = list2[j];
                }
            }
            System.out.println(max);
        }
    }
}
