package com.project.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.jws.WebService;

@WebService
public class QWebService {

    public String getStaff(String name) {

        String result = "";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/staffdb",
                            "root",
                            "yash1234");

            PreparedStatement ps =
                    con.prepareStatement(
                            "select * from staff where sname=?");

            ps.setString(1, name);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {

                result =
                        "No : " + rs.getInt("sno") +
                        ", Name : " + rs.getString("sname") +
                        ", Designation : " + rs.getString("designation") +
                        ", Salary : " + rs.getDouble("salary");
            }
            else {

                result = "Staff Not Found";
            }

            con.close();

        }
        catch(Exception e) {

            result = e.toString();
        }

        return result;
    }
}