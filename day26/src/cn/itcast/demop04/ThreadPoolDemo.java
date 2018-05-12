package cn.itcast.demop04;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadPoolDemo {
    public static void main(String[] args) {
        //调用工厂类的静态方法,创建线程池对象
        //返回线程池对象,是返回的接口
        ExecutorService es = Executors.newFixedThreadPool(2);
        //调用接口实现类对象es中的方法submit提交线程任务
        //将Runnable接口实现类对象,传递
        es.submit(new ThreadPoolRunnable());
        es.submit(new ThreadPoolRunnable());
//        es.submit(new ThreadPoolRunnable());

    }
}
