package cn.itcast.demo02;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
*使用JDK1.5的接口Lock，替换同步代码快，实现线程的安全
* Lock接口方法：
*   lock()获取锁
*   unlock（）释放锁
*  实现类Reen
* */
public class Tickets implements Runnable{
    //定义出售的资源
    private int ticket=100;
   //在类的成员位置，创建Lock接口的实现类对象
    private Lock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            //调用接口的方法lock获取锁
            lock.lock();
            //票数的判断，大于0，可以出售
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (Exception ex) {
                }

                System.out.println(Thread.currentThread().getName() + "出售第" + ticket--);
            }
                //释放锁，调用Lock接口方法unlock
            lock.unlock();
        }
    }
}
