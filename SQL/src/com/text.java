package com;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class text {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://123.57.138.105:3306/test","root","2997385765");
        System.out.println("连接成功");
        String sql="select * from t1 ";
        PreparedStatement ps =connection.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        while (rs.next()){
            System.out.println(rs.getInt("age"));
            System.out.println(rs.getString("uname"));
            System.out.println(rs.getInt("id"));
        }
    }
}
