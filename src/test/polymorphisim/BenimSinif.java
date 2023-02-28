package test.polymorphisim;

import test.MyClass;

public class BenimSinif {

    public static void main(String[] args){

        Employee e = new FullTime();
        System.out.println("full time employee salary is : " + e.salary());

        e=new Contractor();
        System.out.println("contractor time employee salary is : " + e.salary());

        MyOverLoadingClass myOverLoadingClass = new MyOverLoadingClass();
        myOverLoadingClass.method(5);
        myOverLoadingClass.method("str");
        myOverLoadingClass.method("str",5);

    }
}
