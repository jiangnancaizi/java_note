package cn.itcast.demo;
/*
* 通过线程的休眠 出现安全问题
* 解决安全问题，同步技术
*    synchronized(任意的对象){
*    线程要操作的共享数据
*    }
* */
public class Tickets implements Runnable{
    //定义出售的资源
    private int ticket=100;
     private Object obj=new Object();
    @Override
    public void run() {
        while (true) {
            //票数的判断，大于0，可以出售
            //线程共享数据，保证安全，加入同步代码块
            synchronized (obj){
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (Exception ex) {
                }

                System.out.println(Thread.currentThread().getName() + "出售第" + ticket--);
            }
        }
        }
    }
}
