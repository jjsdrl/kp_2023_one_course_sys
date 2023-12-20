package com.hw.dao;

import com.hw.entity.User;
import com.hw.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
    //用户登录（本质上就是根据用户名和密码进行查询）
    public User loginUser(String userAccount,String userPassword){
        User user = null;
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        System.out.println(userAccount);
        System.out.println(userPassword);
        try {
            String sql = "select * from tb_user where user_account = ? and user_password = ? ";
            conn = DBUtil.getConn();
            pstm=conn.prepareStatement(sql);
            pstm.setString(1,userAccount);
            pstm.setString(2,userPassword);
            rs = pstm.executeQuery();
            if (rs.next()){
                user = new User();
                user.setUserId(rs.getInt("user_id"));
                user.setUserAccount(rs.getString("user_account"));
                user.setUserPassword(rs.getString("user_password"));
                user.setUserName(rs.getString("user_name"));
                user.setUserGender(rs.getString("user_gender"));
                user.setUserBirth(rs.getDate("user_birth"));
                user.setUserAge(rs.getInt("user_age"));
                user.setUserAddress(rs.getString("user_address"));
                user.setUserType(rs.getString("user_type"));
                user.setUserPhone(rs.getString("user_phone"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBUtil.closeAll(conn,pstm,rs);
        }
        return user;
    }
}
