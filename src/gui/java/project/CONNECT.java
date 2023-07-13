/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.java.project;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Driver;
import java.sql.Connection;

public class CONNECT {
    private static Connection c = null;
    public static Connection GetConnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String databaseurl="jdbc:mysql://localhost:3306/password-management";
        c =  DriverManager.getConnection(databaseurl,"root", "");
        return c;
    }
}
