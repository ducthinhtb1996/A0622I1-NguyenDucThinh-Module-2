package company.Luyen_tap.bai_1;

public class TestCircleClass {
    public static void main(String[] args) {
        CircleClass showData = new CircleClass();
        showData.setRadius(300);
        showData.setColor("Blue");
        System.out.println(showData.getRadius());
        System.out.println(showData.getColor());
    }
}
