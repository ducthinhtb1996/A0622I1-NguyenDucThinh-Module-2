package company.ss6_ke_thua.point2d3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    ;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] mang2 = new float[3];
        mang2[0] = getX();
        mang2[1] = getY();
        mang2[2] = getZ();
        return mang2;
    }

    public void setXYZ (float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    @Override
    public String toString() {
        return "Point3D{" +
                super.toString()+
                "z=" + z +
                '}';
    }
}
