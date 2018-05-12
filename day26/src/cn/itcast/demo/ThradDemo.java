package cn.itcast.demo;
/*
* 启动创建一个线程
* 创建Thread子类对象
*  子类对象调用方法start()
*   线程执行程序，JVM调用线程中的run
* */
public class ThradDemo {
    public static void main(String[] args){
        subThread st1=new subThread();
        st1.start();
        for(int i=0;i<100;i++){
            System.out.println("main..."+i);
        }
    }

}
