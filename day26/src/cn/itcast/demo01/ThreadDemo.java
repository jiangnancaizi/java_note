package cn.itcast.demo01;
/*
* 每个线程都有自己的名字
* 运行方法main线程，名字就是main
* 其他新建的线程也有名字
*
* static Thread currentThread() 返回正在执行的线程对象
* */

public class ThreadDemo {
    public static void main(String[] args){
        NameThread nt=new NameThread();
     nt.setName("旺财");
        nt.start();

        System.out.println(Thread.currentThread().getName());
    }
}
