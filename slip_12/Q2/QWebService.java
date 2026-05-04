package com.project.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.jws.WebService;

@WebService
public class QWebService {

    public boolean validate(
            String username,
            String password) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/logindb",
                            "root",
                            "yash1234");

            PreparedStatement ps =
                    con.prepareStatement(
                            "select * from users where username=? and password=?");

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            boolean result = rs.next();

            con.close();

            return result;

        }
        catch(Exception e) {

            e.printStackTrace();

            return false;
        }
    }
}