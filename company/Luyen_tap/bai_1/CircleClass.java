package company.Luyen_tap.bai_1;

public class CircleClass {
    private double radius = 100;
    private String color = "red";

    public CircleClass() {
    }
    public CircleClass (double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
// getter
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
//    setter


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
