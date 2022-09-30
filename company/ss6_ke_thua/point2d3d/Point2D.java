package company.ss6_ke_thua.point2d3d;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D () {};
    public Point2D(float x, float y) {
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
        float [] mang1 = new float[2];
        mang1[0] = getX();
        mang1[1] = getY();
        return mang1;
    }
    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
