package cn.itcast.demo01;

import java.io.FileWriter;
import java.io.IOException;

/*
* 字符输出流
* java.io.writer 所有字符输出流的超类
*
* 写的方法write
*  write（int c)写一个字符
*  write（char[] c)写字符数组
*  write(char[] c) 写字符数组一部分 开始索引 写几个
*  write(String s)写字符串
*  Write类的子类对象FileWrite
*  构造方法 写入数据的目的
* */
public class writeDemo01 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("G:\\g.txt");
        fw.write(100);
        fw.flush();
        //写一个字符数组
        char[] c={'a','b','c'};
        fw.write(c);
        fw.flush();
        //写字符数组的一部分
        fw.write(c,1,2);
        fw.flush();
    }
}
