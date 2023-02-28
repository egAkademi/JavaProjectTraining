package test.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyClass {

    public static void main(String[] args) throws FileNotFoundException {

        File file =new File("c://myfile.tex");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //throw e;
        }finally {
            try {
                if (fr!=null){
                    fr.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("after exeption");
//        int myArray [] = {1,2,3};
//        System.out.println(myArray[3]);
    }

}
