package company.bai_tap_interface2;

public class Shape {
    public abstract class shape extends Colorable {
        private String color = "green";
        private boolean filled = true;

        public shape() {
        }

        public shape(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        @Override
        public String toString() {
            return "a Shape with color of "
                    + getColor()
                    + " and "
                    + (isFilled() ? "filled\n" : "not filled\n");
        }

        public static void printShape(shape[] shapes) {
            for (shape x : shapes) {
                System.out.println(x.toString());
            }
        }

        public static boolean isColorable(shape shapes) {
            return shapes != null;
        }

        @Override
        public void howToColor() {

        }
    }
    }
