package cn.itcast.demo05;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class propertiesdemo {
    public static void main(String[] args) throws Exception {
     InputStream in= propertiesdemo.class.getClassLoader().getResourceAsStream("database.properties");
        System.out.println(in);
        Properties pro=new Properties();
        pro.load(in);
        //获取集合中的键值对
        String driverClass=pro.getProperty("driverClass");
        String url = pro.getProperty("url");
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");
        Class.forName(driverClass);
    Connection con = DriverManager.getConnection(url, username, password);
        System.out.println(con);
    }
}
