package cn.itcast.demo;

import java.io.FileOutputStream;
import java.io.IOException;

/*
* IO流的异常处理
* try catch finally
*
* 1 保证流对象变量，作用域足够
* 2.catch里面，怎么处理异常
*     输出异常信息，目的是看哪里出了问题
*     停下程序，重新尝试
* 3. 如果流对象建立失败，需要关闭资源吗
*     new 对象的时候，失败了，没有占用系统资源
*     释放资源的时候，流对象盘空
*     变量不是null，对象创建成功，需要释放资源
* */
public class FileOutputStreamDemo02 {
    public static void main(String[] args){
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream("D:\\d.txt");
            fos.write(100);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
            throw new RuntimeException("文件写入失败，重试");
        }finally {
            try {
                if(fos!=null)
                fos.close();
            }catch (IOException ex){
                throw new RuntimeException("文件资源关闭失败");
            }
        }
    }
}
