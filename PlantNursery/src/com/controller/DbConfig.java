/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gauresh
 */
public class DbConfig {

    public static Connection con;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        try {
            String driver = "org.apache.derby.jdbc.EmbeddedDriver";
            String url = "jdbc:derby://localhost:1527/flower=true";
            //srng dbname = "root";
            String user = "root";
            String pass = "root";

            Class.forName(driver);
            Connection con = (Connection) DriverManager.getConnection(
                    url , user, pass);
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
