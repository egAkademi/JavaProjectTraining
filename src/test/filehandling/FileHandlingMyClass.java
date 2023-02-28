package test.filehandling;

import java.io.*;

public class FileHandlingMyClass {

    public static void main(String[] args) {

        File file =new File("myfile.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            FileWriter fw = new FileWriter(file);
            fw.write("first line");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader(file);
            int i;
            while ((i=fr.read())!=-1){}
                System.out.println((char) i);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
