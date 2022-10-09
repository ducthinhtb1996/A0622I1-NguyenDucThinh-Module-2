package company.overLoading;

public class MyMath {
    public int timMax(int a, int b) {
        if (a>b) {
            return a;
        } else {
            return b;
        }
    }

    public double timMax(double a, double b) {
        if (a>b) {
            return a;
        } else {
            return b;
        }
    }
    public int timMax(int [] listNumber) {
        int max = 0;
        for (int i = 0; i <listNumber.length ; i++) {
            if(listNumber[i]>max) {
                max = listNumber[i];
            }
        }
        return max;
    }
}
