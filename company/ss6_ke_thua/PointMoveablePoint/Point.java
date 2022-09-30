package company.ss6_ke_thua.PointMoveablePoint;

public class Point {
    private float x=0.0f;
    private float y=0.0f;
    public Point () {};

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float [] mang3 = new float[2];
        mang3[0] = getX();
        mang3[1] = getY();
        return mang3;
    }

    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
