package test;

    public class MySubClass extends MySuperclass {
        String commonStr = "sub common string";

        public MySubClass(String strConstructor){
            super(strConstructor);
            System.out.println("sub class constructor");}

        public void subClassMetgod(){
            System.out.println("sub class method");
        }

        public void printCommonStr(){
            System.out.println(commonStr);
            System.out.println(super.commonStr);
        }

        public void commonMethod(){
            System.out.println("sub common method");
        }

        public void printCommonMethod(){
            commonMethod();
            super.commonMethod();
        }
    }
