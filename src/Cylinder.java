public class Cylinder extends Circle {
    double height = 1;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double volume() {
        return radius * Math.PI * Math.PI * height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString()+ "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
