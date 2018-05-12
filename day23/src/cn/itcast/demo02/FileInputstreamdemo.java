package cn.itcast.demo02;

import java.io.FileInputStream;
import java.io.IOException;

/*
* FileInputStream读取文件
* 构造方法 为这个流对象 绑定数据源
*
* 输入流读取文件的步骤
*   1.创建字节输入流的子类对象
*   2.调用读取方法read()
*   3.关闭资源
* read方法
*    read（）执行一次，就会自动读取下一个字节
*    返回值 返回的是读取到的字节，读取到结尾就返回-1
* */
public class FileInputstreamdemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("G:\\c.txt");
        //读取一个字节，调用read方法 返回int
        //循环的方式读取文件，循环结束条件 read()方法返回-1
        int len=0;
        while((len=fis.read())!=-1){
            System.out.print((char)len);
        }
        fis.close();
    }
}
