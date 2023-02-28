package test;

public class MyClass {
    int i=5;
    String str= "hello";

    public MyClass() {
    }

    public static void main(String[] args){
        MyClass myClass = new MyClass();
        myClass.stringCheck();
        myClass.ifElseCheck();
        myClass.forLoopCheck();
        myClass.forEachLoopCheck();
        myClass.whileLoopCheck();
        myClass.switchCheck();

    }

    public void switchCheck(){
        String str = "a";
        switch (str) {
            case "a":
                System.out.println(str);
                break;
            case "b":
                System.out.println(str);
                break;
            default:
                System.out.println(str);
        }
    }

    public void whileLoopCheck(){
        int i = 5;
        while (i>0){
            System.out.println(i);
            i--;
            if (i==3){
                break;
            }
        }
    }
    
    public void forLoopCheck(){
        for (int i = 0; i<5; i++){
            System.out.println("i is : " + i);
            if (i==3){
                break;
            }
        }
    }

    public void forEachLoopCheck(){
        String [] myArray = {"a","b","c"};
        for (String str : myArray) {
            System.out.println(str);
            if (str.equalsIgnoreCase("b")){
                break;
            }
        }
    }

    public void ifElseCheck(){
        boolean flag = true;
        String str3="str";

        if (str3.contains("str")){
            System.out.println("if");
        }else {
            System.out.println("else");
        }
    }

    public void stringCheck(){
        str=str.concat("!!");
        System.out.println(str);

        str = str.toUpperCase();
        System.out.println(str);

        boolean flag = str.equalsIgnoreCase("HELLO!!");
        System.out.println(flag);

        String str1;
        str1=str.substring(2);
        System.out.println(str1);

        String str2;
        str2="5";
        int i = Integer.parseInt(str2);
        System.out.println(str2);

        i = 6;
        str = String.valueOf(i);
        System.out.println(i);
    }

    public MyClass initialize(){
        i=6;
        return this;
    }
}
