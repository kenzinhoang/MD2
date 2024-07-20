package baitap2;

public class Point3D extends Point2D {
    private float z = 0.0f;

    //Construc

    public Point3D() {
        super();
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    //get&set

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] xyz = {super.getXY()[1], super.getXY()[2], z};
        return xyz;
    }

    //toString
    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + z +
                '}';
    }


}


