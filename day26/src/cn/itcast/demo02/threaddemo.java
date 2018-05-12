package cn.itcast.demo02;

public class threaddemo {
    public static void main(String[] args) throws Exception{
//        for(int i=0;i<5;i++){
//            Thread.sleep(500);
//            System.out.println(i);
//        }
        new SleepThread().start();
    }
}
