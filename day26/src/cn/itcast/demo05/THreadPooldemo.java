package cn.itcast.demo05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/*
* 使用多线程技术求和
* 两个线程 一个实现1+。。+100 另一个1+。。。200
* 多线程实现异步计算
* */
public class THreadPooldemo {
    public static void main(String[] args) throws Exception{
        ExecutorService es=Executors.newFixedThreadPool(2);
      Future<Integer>f1= es.submit(new GetSumCallable(100));
        Future<Integer>f2= es.submit(new GetSumCallable(200));
        System.out.println(f1.get());
        System.out.println(f2.get());
        es.shutdown();
    }
}
