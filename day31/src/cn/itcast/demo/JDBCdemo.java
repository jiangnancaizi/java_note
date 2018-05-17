package cn.itcast.demo;


import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

public class JDBCdemo {
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        //注册驱动 反射技术，将驱动类加入到内容
        //DriverManager.registerDriver(new Driver());
       Class.forName("com.mysql.jdbc.Driver");

       //2 获得数据库的连接 DriverManager类中的静态方法
        //static Connection getConnection(String url, String user, String password)
        //url:数据库地址 jdbc:mysql//主机ip：端口//数据库名字
        String url="jdbc:mysql://localhost:3306/mybase";
        String unsername="root",password="root";
       Connection con= DriverManager.getConnection(url,unsername,password);
//       System.out.println(con);

       //获得语句执行平台，通过数据库连接对象，获取到sql语句的执行对象
        //con对象调用方法，creatStatement（）获取Statement对象
        Statement stat= con.createStatement();
     //执行sql语句 通过执行者对象调用方法
        // int executeUpdate(String sql) 执行数据库SQL语句
     int row=stat.executeUpdate
             ("INSERT INTO sort(sname,sprice,sdesc) VALUES('汽车',200000,'疯狂涨价')");
     System.out.println(row);
     stat.close();
     con.close();

}
}
