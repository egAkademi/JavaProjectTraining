package test;

public class MySuperclass {

    String superStr = "super class string";
    String commonStr = "common class string";

    public MySuperclass(String strConstructor){
        System.out.println("super class contructor");
        System.out.println(strConstructor);
    }

    public void superClassMethod(){
        System.out.println("super class method");
    }

    public void commonMethod(){
        System.out.println("super common method");
    }
}
