package cn.lai.designpatterns.decorator.io;

import java.io.*;
import java.net.URL;


public class TestInputStream {
    public static void main(String[] args) throws IOException {
        int c;
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(System.getProperty("user.dir"));//用户的当前路径

        //src/test.txt


        InputStream resourceAsStream = TestInputStream.class.getClassLoader().getResourceAsStream("./test.txt");
        InputStream is = new LowerCaseInputStream(new BufferedInputStream(resourceAsStream));
        while ((c = is.read()) >= 0) {
            System.out.print((char)c);
        }
        is.close();
    }



}
