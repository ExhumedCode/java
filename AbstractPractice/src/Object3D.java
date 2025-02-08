public abstract class Object3D {
    // Attribute
    private String material;
    private String color;

    // Constructor
    protected Object3D(String material, String color) {
        this.material = material;
        this.color = color;
    }

    // Getters for private attributes
    String getMaterial() {
        return this.material;
    }

    String getColor() {
        return this.color;
    }

    // Abstract method to calculate the volume of the shape
    public abstract double calculateVolume();

    // Abstract method to calculate the surface area of the shape
    public abstract double calculateSurfaceArea();
}

class Sphere extends Object3D {
    private double radius;

    Sphere(String material, String color, double radius) {
        super(material, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }

    public double calculateSurfaceArea() {
        double area = 4 * Math.PI * Math.pow(radius, 2);
        return area;
    }
}