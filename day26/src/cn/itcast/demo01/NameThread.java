package cn.itcast.demo01;
/*
* 获取线程的名字，父类方法
* String getName()
* */
public class NameThread extends Thread {
    public NameThread(){
        super("xiaoqian");
    }
    public void run(){
        System.out.println(super.getName());
    }
}
