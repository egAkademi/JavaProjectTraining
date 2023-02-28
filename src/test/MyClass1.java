package test;

public class MyClass1 {

    public static void main(String[] args){
        MySubClass mySubClass = new MySubClass("string constructor");
        mySubClass.superClassMethod();
        System.out.println(mySubClass.superStr);
        mySubClass.subClassMetgod();
        mySubClass.printCommonStr();
        mySubClass.printCommonMethod();
    }
}
