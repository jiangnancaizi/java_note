package cn.itcast.demo02;
/*
* 成员变量和局部变量的区别
*   1.定义的位置不同
*     成员变量，定义在类中，方法中
*     局部变量，方法内，语句内
*   2.作用域不同
*     成员变量 作用域是整个类
*     局部变量 方法内，语句内
*    3.默认值不同
*      成员变量 有自己的默认值
*      局部变量没有默认值，不赋值不能使用
*      4.内存位置不同
*       成员变量 跟随对象进入对内存中
*       局部变量 跟随方法 进入栈内存
*     5 生命周期不同
*      成员变量，跟随对象 在对内存中，内存等待JVM清理，生命周期较长
*      局部变量，跟随方法，方法出栈，生命周期较短
* */
public class carTest {
    public  static void main(String[] args){
        Car c=new Car();
        c.run();
    }
}
