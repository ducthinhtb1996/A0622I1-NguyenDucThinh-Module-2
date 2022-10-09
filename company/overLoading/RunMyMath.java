package company.overLoading;

public class RunMyMath {
    public static void main(String[] args) {
        MyMath searchMax = new MyMath();
        System.out.println(searchMax.timMax(4,6));
        System.out.println(searchMax.timMax(4.0,6.0));
        int [] listNumber = new int[]{1,2,3,4,5};
        System.out.println(searchMax.timMax(listNumber));
    }
}
