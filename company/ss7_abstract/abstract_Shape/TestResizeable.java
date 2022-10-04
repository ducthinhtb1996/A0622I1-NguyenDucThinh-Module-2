package company.ss7_abstract.abstract_Shape;

public class TestResizeable {
    public static void main(String[] args) {Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4, "Red", true);
        shapes[1] = new Rectangle("Orange", true, 6, 4);
        shapes[2] = new Square("Pink", false, 3);

        for (Shape a : shapes) {
            System.out.println(a);
        }
        for (Shape a : shapes) {
            a.resize(Math.floor(Math.random() * 10));
        }
        System.out.println();
        Shape.printShape(shapes);

    }
}
