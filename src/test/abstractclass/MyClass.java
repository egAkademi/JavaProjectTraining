package test.abstractclass;

public class MyClass {

    public static void main(String[] args) {

        Circle circle = new Circle("red",5.0);
        System.out.println(circle.info());

        Square square = new Square("Blue",10.0);
        System.out.println(square.info());

    }
}
