package test.polymorphisim;

public class MyOverLoadingClass {

    public void method(String str){
        System.out.println(str);
    }

    public void method(String str,int i){
        System.out.println(str + i);
    }

    public void method(int i){
        System.out.println(i);
    }
}
