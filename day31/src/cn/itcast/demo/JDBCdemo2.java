package cn.itcast.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCdemo2 {
    public static void main(String[] args) throws Exception{
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2.获取连接对象
        String url="jdbc:mysql://localhost:3306/mybase";
        String unsername="root",password="root";
        Connection con= DriverManager.getConnection(url,unsername,password);
        Statement stat=con.createStatement();

        Scanner sc=new Scanner(System.in);
        String user=sc.nextLine();
        String pass=sc.nextLine();
        //执行SQL语句，数据表，查询用户名和密码，如果存在，登陆成功，如果不存在，大陆失败
        String sql="SELECT * FROM users WHERE usename='"+user+"' AND PASSWORD='"+pass+"'";
        ResultSet rs=stat.executeQuery(sql);
       while(rs.next()){
           System.out.println(rs.getString("usename")+" "+rs.getString("password"));
       }

        rs.close();
        stat.close();
        con.close();
    }
}
