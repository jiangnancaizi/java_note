package cn.itcast.demo;
/*
* java程序实现用户登陆，用户名和密码，数据库查询
* 防止注入攻击
* Statement接口实现类，作用执行SQL语句，返回结果集
* 有一个子接口PrepredStatement(SQL预编译存储，多次高效执行SQL）
* PrepreStatement的实现类数据库驱动中，如何获取接口的实现类
*
* */
import java.sql.*;
import java.util.Scanner;

public class JDBCdemo3 {
    public static void main(String[] args) throws Exception{
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2.获取连接对象
        String url="jdbc:mysql://localhost:3306/mybase";
        String unsername="root",password="root";
        Connection con= DriverManager.getConnection(url,unsername,password);


        Scanner sc=new Scanner(System.in);
        String user=sc.nextLine();
        String pass=sc.nextLine();
        //执行SQL语句，数据表，查询用户名和密码，如果存在，登陆成功，如果不存在，大陆失败
        String sql="SELECT * FROM users WHERE usename=?AND PASSWORD=?";
        //调用Connection接口的方法prepareStatement,获取PrepareStatement接口的实现类
        PreparedStatement pst=con.prepareStatement(sql);
        System.out.println(pst);
        //调用pst对象的set方法，设置问号占位符的参数
        pst.setObject(1,user);
        pst.setObject(2,pass);
        ResultSet rs=pst.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString("usename")+" "+rs.getString("password"));
        }

        rs.close();
        pst.close();
        con.close();
    }
}
