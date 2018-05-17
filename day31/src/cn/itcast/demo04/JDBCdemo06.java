package cn.itcast.demo04;

import cn.itcast.jdbcutil.JDBCutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JDBCdemo06 {
    public static void main(String[] args) throws Exception{
        //使用JDBC工具类，直接获取数据库连接对象
        Connection con=JDBCutils.getConnection();
        //获取连接数据库SQL语句的执行对象
        PreparedStatement pst=con.prepareStatement("SELECT * FROM sort");
        //调用查询方法，获取结果集
        ResultSet rs=pst.executeQuery();
        //创建集合对象
        List<Sort>list=new ArrayList<>();
        while(rs.next()){
            //获取到每个列数据,封装到Sort对象中
            Sort s = new Sort(rs.getInt("sid"),rs.getString("sname"),rs.getDouble("sprice"),rs.getString("sdesc"));
            //封装的Sort对象,存储到集合中
            list.add(s);

        }
        JDBCutils.close(con,pst,rs);
        for (Sort s:
             list) {
            System.out.println(s);

        }
    }
}
