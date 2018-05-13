package cn.itcast.demo04;
/*
* 开启输入线程和输出线程，实现赋值和dayin
* */
public class ThreadDemo {
    public static void main(String[] args){
        resource r=new resource();
        Input in=new Input(r);
        output out=new output(r);

        Thread tin=new Thread(in);
        Thread tout=new Thread(out);

        tin.start();
        tout.start();
    }
}
