package cn.itcast.demo05;



public class personTest {
    public static void main(String[] args){
        person p1=new person();
        person p2=new person();
        p1.setAge(12);
        p2.setAge(13);
        boolean b=p1.caompare(p2);
        System.out.println(b);
    }
}
