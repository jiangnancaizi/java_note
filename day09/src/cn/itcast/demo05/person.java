package cn.itcast.demo05;

import cn.itcast.demo03.Person;

public class person {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    /*
    * 定义方法，比较是否是同龄人，是返回true,不是返回false
    * 谁和谁比啊，我自己和别人比
    * 方法的返回值 true false
    * 方法的参数 别人 对象
    * */
    public boolean caompare(person p){
        return this.age==p.age;
    }
}
