package cn.itcast.demo02;

import java.io.FileInputStream;
import java.io.IOException;

/*
* FileInputStream 读取文件
*   读取方法 int read(byte[] b] 读取字节数组
*   数组的作用 缓冲的作用，提高效率
*    read返回int，表示读取到多少个有效的字节数
* */
public class FileInputstreamdemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("G:\\c.txt");

        byte[] b=new byte[2];
        int len=0;
        while ((len=fis.read(b))!=-1) {
            System.out.println(new String(b,0,len));
        }
        fis.close();
    }
}
