package test.exceptionhandling;

import java.io.File;
import java.io.FileReader;

public class MyClass1 {

    public static void main(String[] args) {

        File file =new File("c://myfile.tex");
        try (FileReader fr = new FileReader(file)) {
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("after exeption");
    }
}
