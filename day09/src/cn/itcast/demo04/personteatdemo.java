package cn.itcast.demo04;

public class personteatdemo {
    public static void main(String[] args){
        Person p=new Person();
        p.setAge(18);
        p.setName("张三");
        p.speak();
        //调用get方法，获取成员变量的值
        System.out.println(p.getAge());
        System.out.println(p.getName());
    }
}
