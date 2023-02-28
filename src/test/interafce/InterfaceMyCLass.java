package test.interafce;

import test.abstractclass.Circle;
import test.abstractclass.Square;

public class InterfaceMyCLass {

    public static void main(String[] args) {

        InterfaceCircle circle = new InterfaceCircle("red",5.0);
        System.out.println(circle.info());

        InterfaceSquare square = new InterfaceSquare("Blue",10.0);
        System.out.println(square.info());

    }

}
