package cn.itcast.demo02;

import java.io.FileInputStream;
import java.io.IOException;

/*
* FileInputStream读取文件
* 构造方法：为这个流绑定数据源
* 参数：
*    File 类型对象
*    String 对象
* 输入流读取文件的步骤
*     1.创建字节输入流的子类对象
*     2.调用读取方法read读取
*     3.关闭资源
*     read()方法，
*      read()执行一次，就会自动读取下一个字节
*      返回值，返回的是读取到的字节，读取到结尾返回-1
* */
public class inputstreamdemo02 {
    public static void main(String[] args)throws IOException {
        FileInputStream fis=new FileInputStream("G:\\黑马\\黑马32\\01_北京黑马最新基础班\\day23\\day23_code\\讲师代码\\day23\\src\\cn\\itcast\\demo1\\FileInputStreamDemo.java");
        //读取一个字节，调用read方法，返回int
        //使用循环的方式读取文件 循环结束的条件 read（）方法返回-1
        int len=0;
        while ((len=fis.read())!=-1){
            System.out.print((char)len);
        }
        //关闭资源
        fis.close();
    }
}
