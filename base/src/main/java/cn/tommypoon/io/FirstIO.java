package cn.tommypoon.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FirstIO {

    public static void main(String[] args) {
        // read from parent project root directory
        File file = new File("first_io.txt");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        try {
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        File file1 = new File("base/src/main/resources/first_io.txt");
        System.out.println(file1.exists());
        System.out.println(file1.getPath());

        // write to file
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file1, true);
            String content = "\nhello java io";
            fileOutputStream.write(content.getBytes());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        // read from file
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file1);
            int read = fileInputStream.read();
            System.out.println((char)read);
            StringBuffer stringBuffer = new StringBuffer();
            int n = 0;
            while (n != -1) {
                n = fileInputStream.read();
                char by = (char) n;
                stringBuffer.append(by);
            }
            System.out.println(stringBuffer);

            System.out.println((char) fileInputStream.read());
            System.out.println((char) fileInputStream.read());
            System.out.println((char) fileInputStream.read());
            System.out.println((char) fileInputStream.read());
            System.out.println((char) fileInputStream.read());
            System.out.println((char) fileInputStream.read());
            System.out.println((char) fileInputStream.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
