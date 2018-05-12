package cn.itcast.demo01;
/*
* 创建出Car类的变量（对象）
* 变量，对象调用属性，成员变量
* 变量，调用成员方法
* */
public class CarTest {
    public static void main(String[] args){
        //创建Car类的类变量 对象
        Car c=new Car();
        //对象，调用类中的属性和方法
        c.color="baise";
        c.count=5;
        c.run();
    }
}
