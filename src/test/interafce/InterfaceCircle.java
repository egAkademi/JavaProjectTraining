package test.interafce;

public class InterfaceCircle implements Shape{

    String color;
    double radius;

    public InterfaceCircle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String info() {
        return "I'm a " + color() + "Circle and my area is " + area();
    }
}
