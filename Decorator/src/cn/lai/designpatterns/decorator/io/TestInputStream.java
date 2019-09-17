package cn.lai.designpatterns.decorator.io;

import java.io.*;

public class TestInputStream {
    public static void main(String[] args) throws IOException {
        int c;
        System.out.println(new File(".").getAbsolutePath());
        //src/test.txt
        InputStream is = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/test.txt")));
        while ((c = is.read()) >= 0) {
            System.out.println(c);
        }
        is.close();
    }



}
