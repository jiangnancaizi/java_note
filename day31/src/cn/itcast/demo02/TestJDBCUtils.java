package cn.itcast.demo02;

import cn.itcast.jdbcutil.JDBCutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestJDBCUtils {
    public static void main(String[] args) throws Exception{
        Connection con=JDBCutils.getConnection();
        PreparedStatement pst=con.prepareStatement("SELECT sname FROM sort");
        ResultSet rs=pst.executeQuery();
        while (rs.next()){
            System.out.println(rs.getString("sname"));
        }
    }
}
