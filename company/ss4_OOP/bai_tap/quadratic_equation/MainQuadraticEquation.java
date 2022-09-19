package company.ss4_OOP.bai_tap.quadratic_equation;
import java.util.Scanner;
public class MainQuadraticEquation {
        public static void main(String[] args) {
            QuadraticEquation pt1 = new QuadraticEquation();
            Scanner sc = new Scanner(System.in);
            System.out.println("Cho phương trình bậc 2 có dạng: y= Ax^2 + Bx + C");
            System.out.print("Nhập giá trị của A, B và C : ");
            double A = sc.nextDouble();;
            double B = sc.nextDouble();;
            double C = sc.nextDouble();;
            pt1.setterAll(A,B,C);
            if (pt1.getDiscriminant() > 0) {
                System.out.println("The equation has two roots " + pt1.getRood1() + " and " + pt1.getRood2());
            } else if (pt1.getDiscriminant() == 0) {
                System.out.println("The equation has one root " + pt1.getRood1());
            } else {
                System.out.println("The equation has no real roots");
            }
        }
}
