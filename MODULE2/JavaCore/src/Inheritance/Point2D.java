package Inheritance;

public class Point2D {
    public float x = 0.0f;
    public float y = 0.0f;
    public float arr[] = new float[2];

    public Point2D() {
    }

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
        arr[0] = x;
        arr[1] = y;
        return arr;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(2.0f, 3.0f);
        System.out.println(point2D);
    }
}
