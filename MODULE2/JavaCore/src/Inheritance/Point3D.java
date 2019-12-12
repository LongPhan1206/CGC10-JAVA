package Inheritance;

public class Point3D extends Point2D {
    public float z = 0.0f;
    public float arr2[] = new float[3];

    public Point3D() {
    }

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
        arr2[0] = x;
        arr2[1] = y;
        arr2[2] = z;
        return arr2;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {

        return "(" + x + "," + y + "," + z + ")";
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(3.0f, 4.0f, 5.0f);
        System.out.println(point3D);
    }
}
