package cn.itcast.demo04;
/*
* 输入的线程，对资源对象resource中的成员变量进行赋值
* 一次赋值张三，男
* 下一次赋值李四 ，女
* */
public class Input implements Runnable {
    private resource r;
    public  Input(resource r){this.r=r;}
    @Override
    public void run() {
        int i=0;
        while (true){
            synchronized (r) {
                if(!r.flag){
                    try {
                   r.wait();
                    }catch (Exception ec){};
                }

                if (i % 2 == 0) {
                    r.name = "张三";
                    r.sex = "男";
                } else {
                    r.name = "lisi";
                    r.sex = "nv";
                }
                r.flag=true;
                r.notify();
            }
            i++;
        }

    }
}
