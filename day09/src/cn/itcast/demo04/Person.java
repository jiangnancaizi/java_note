package cn.itcast.demo04;
/*
* 描述人：
*    属性：姓名和年龄
*    方法：说话
*
*   私有化所有的属性（成员变量） 必须写对应的get/set方法
*   凡是自定义的类，自定义成员变量，应该私有化，提供get/set
*
*   this关键字：
*     区分成员变量和局部变量同名
*
* */
public class Person {
    private String name;
    private int age;

    //set方法,变量name,age赋值

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    //get方法，变量name，age值的获取

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public void speak(){
        String name="haha";
        int age=16;
        System.out.println("人在说话  " + this.name + "..." + this.age);
    }
}
