package java_basic;

import java.io.File;
import java.util.Formatter;

public class CreateFile {
    public static void main(String[] args) {
//        File dir = new File("person");
//        dir.mkdir(); // directory will be created
//        System.out.println(dir.getAbsolutePath());
//        System.out.println(dir.getName());
//        dir.delete();

//        // file creation
//        File file1 = new File("student.txt");
//        File file2 = new File("person.txt");
//        try {
//            file1.createNewFile();
//            file2.createNewFile();
//
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }

        // ==== write inside file======
        try {
            Formatter formatter = new Formatter("C:/Users/nadim/OneDrive/Desktop/D Drive/SDET_JAVA/Java_basic/hello.txt");
//            formatter.format(\"I am Bangladeshi");
            formatter.format("%s\r\n","I am Bangladeshi");
            formatter.close();
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
