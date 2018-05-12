package cn.itcast.demo03;

public class TestPerson {
    public static void main(String[] args){
        int a=1;
        function(a);
        System.out.println(a);

        Person p=new Person();
        p.name="张三";
        System.out.println(p.name);
        function(p);
        System.out.println(p.name);
    }
    /*
    * 定义方法，参数类型是引用数据类型
    * 参数是Person类型
    * p接收的是一个内存的地址
    * main中的p
    * function 中的变量p 保存的地址是一样的
    * */
    public static void function(Person p){
        p.name="李四";
    }
    /*
    * 定义方法，参数类型是基本类型
    * */
    public static void function(int a){
        a+=5;
    }
}
