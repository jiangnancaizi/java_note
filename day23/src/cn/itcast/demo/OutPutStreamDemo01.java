package cn.itcast.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* FileOutputStream 文件的续写和换行
* 续写：FileOutputStream 构造方法，的第二个参数中，加入true
* 在文件中 写入换行 换行符 \r\n
* */
public class OutPutStreamDemo01 {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\b.txt");
        FileOutputStream fos=new FileOutputStream(file,true);
        fos.write("hello\r\n".getBytes());
        fos.write("world".getBytes());
        fos.close();
    }
}
