package cn.itcast.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
* JBDC技术,查询数据表，获取结果集
* */
public class JDBCdemo1 {
    public static void main(String[] args) throws Exception{
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2.获取连接对象
        String url="jdbc:mysql://localhost:3306/mybase";
        String unsername="root",password="root";
        Connection con= DriverManager.getConnection(url,unsername,password);
        // 获取SQL语句执行对象
        Statement stat=con.createStatement();
        //拼写查询的SQL语句
        String sql="SELECT * FROM sort";

        //4 调用执行者对象，执行SQL语句获取结果集
        //ResultSet executeQuery(sql); 执行sql语句中的select查询
        //返回值ResultSet接口的实现类对象，实现类在mysql驱动中
        ResultSet rs=stat.executeQuery(sql);

        //处理结果集
        //ResultSet接口方法 boolean next() 返回true,有结果集
        while(rs.next()){
            System.out.println(rs.getInt("sid")+" "+rs.getString("sname")+
            "  "+rs.getDouble("sprice")+" "+rs.getString("sdesc"));
        }
        rs.close();
        stat.close();
        con.close();
    }
}
