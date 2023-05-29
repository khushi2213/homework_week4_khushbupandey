package cylinder_p19;

/**
 * Write a class with the name Circle. The class needs one field (instance variable) with name radius
 * of type double.
 * The class needs to have one constructor with parameter radius of type double and it needs to initialize
 * the fields.
 * In case the radius parameter is less than 0 it needs to set the radius field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getRadius without any parameters, it needs to return the value of the radius
 * field.
 * ● Method named getArea without any parameters, it needs to return the calculated area
 * (radius * radius * PI). For PI use Math.PI constant.
 */

public class Circle {
    double radius;

    // 1st constructor, which sets both radius and color to default
    public Circle() {
        super();
        this.radius = 1.0;
    }

    // 2nd constructor with given radius, but color default
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Construtor to construct a new instance of Circle with the given radius and color
    public Circle (double radius, String color) {
        this(radius);

    }

    public Circle (double radius, String color, boolean filled) {
        this(radius, color);

    }

    // A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }

    // Setter for instance variable radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // A public method for computing the area of circle
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "+radius
                + ", which is a subclass of "+super.toString();
    }
}

