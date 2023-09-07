package com.web.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //connection URL username and password
		//try(Connection connection= DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6641926","sql6641926", "pG7bX7JQLi");

       // Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root", "manju12345");
        Connection connection= DriverManager.getConnection("jdbc:mysql://test-db.csse9hpx86cr.us-east-1.rds.amazonaws.com:3306/testdb","admin","MySql2023");        
        return connection;
    }
}