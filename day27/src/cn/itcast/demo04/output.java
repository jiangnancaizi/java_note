package cn.itcast.demo04;
/*
* 输出线程，对资源对象resource中成员变量，输出值
* */
public class output implements  Runnable {
    private resource r;
    public  output(resource r){this.r=r;}
    @Override
    public void run() {
        while(true){
            synchronized (r){
                if(r.flag==false){
                    try {
                       r.wait();
                    }catch (Exception ex){};
                }

            System.out.println(r.name+".."+r.sex);}
            r.flag=false;
            r.notify();
        }
    }
}
