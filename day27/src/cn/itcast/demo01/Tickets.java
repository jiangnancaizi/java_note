package cn.itcast.demo01;
/*
* 通过线程的休眠 出现安全问题
* 解决安全问题，同步技术
*    synchronized(任意的对象){
*    线程要操作的共享数据
*    }
*
* 采用同步方法形式，解决线程的安全问题
* 好处，代码简洁
* 将线程共享数据，和同步，抽取到一个方法中
* 在方法的申明上，加入同步关键字
*
* 问题：
*   同步方法有锁吗，肯定有，同步方法中的对象梭，是本类对象的引用 this
*   如果是静态方法，有同步锁吗，绝对不是this
*   锁是本类自己.calss 属性
*   静态方法，同步锁，是本类类名.calss属性
* */
public class Tickets implements Runnable{
    //定义出售的资源
    private int ticket=100;
//     private Object obj=new Object();

    @Override
    public void run() {
        while(true){
                payTicket();
        }
    }
    public synchronized void payTicket(){
        if(ticket>0){
            try {
                Thread.sleep(20);
            }catch (Exception ex){

            }
            System.out.println(Thread.currentThread().getName()+"出售第"+ticket--);
        }
    }
}
