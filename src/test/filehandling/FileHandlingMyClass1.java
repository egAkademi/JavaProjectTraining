package test.filehandling;

import java.io.*;

public class FileHandlingMyClass1 {
    public static void main(String[] args) {

        File file = new File("myfile.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.canWrite());

        try {
            FileOutputStream os = new FileOutputStream(file);
            String str = "My String";
            os.write(str.getBytes());
            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream is = new FileInputStream(file);
            int i;
            while ((i=is.read())!=-1){}
                System.out.println((char) i);
            is.close();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        file.delete();
    }
}
