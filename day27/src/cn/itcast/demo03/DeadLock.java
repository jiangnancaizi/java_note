package cn.itcast.demo03;

public class DeadLock implements Runnable{
    private int i=0;

    @Override
    public void run() {
        while (true){
            if(i%2==0){
                //先进入A同步，再进入B同步
                synchronized (LockA.locka){
                    System.out.println("if....locka");
                    synchronized (LockB.lockb){
                        System.out.println("if...lockb");
                    }
                }
            }else {
                //先进入B同步，在进入A同步
                synchronized (LockB.lockb){
                    System.out.println("else....lockb");
                    synchronized (LockA.locka){
                        System.out.println("else...locka");
                    }
                }
            }
            i++;

        }
    }
}
