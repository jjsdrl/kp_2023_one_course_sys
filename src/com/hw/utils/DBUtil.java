package com.hw.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//数据库封装
public class DBUtil {
    //数据库驱动
    private static final String DB_DRIVER="com.mysql.cj.jdbc.Driver";
    //url配置

    private static final String DB_URL="jdbc:mysql://localhost:3306/java_one_course_sys";
    //数据库用户名
    private static final String DB_USER="root";
    //数据库密码
    private static final String DB_PASS="123456";

    //获取数据库连接的方法
    public static Connection getConn(){
        Connection coon = null;
        try {
            Class.forName(DB_DRIVER);//1.加载驱动
            coon = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);//2.获取数据库连接
        }catch (Exception e){
            e.printStackTrace();
        }
        return coon;
    }

    //关闭数据库连接的方法
    public static void closeAll(Connection conn, PreparedStatement pstm, ResultSet rs ){
        try {
            if (rs != null){
                rs.close();
            }
            if (pstm != null){
                pstm.close();
            }
            if (conn != null){
                conn.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
