package cn.itcast.demop04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
* 实现线程程序的第三个方式 ，实现Callable接口方式
* 实现步骤
*   工厂类 Executors静态方法 newFixedThreadPool方法，创建线程池对象
*   线程池对象 ExecutorService接口实现类，调用方法submit提交线程任务
*   submit(Callabel c)
* */
public class ThreadPoolDemo02 {
    public static void main(String[] args) throws Exception{
     ExecutorService es= Executors.newFixedThreadPool(2);
     //提交线程任务的方法subnit方法返回 Future接口的实现类
       Future<String> f= es.submit(new ThreadPoolCallable());
       String s=f.get();
       System.out.println(s);
    }
}
