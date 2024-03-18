/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pankaj.dao;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
        

/**
 *
 * @author panka
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafedb","root","jmatheworden27");
            return con;
        }
            catch(Exception e){
                    return null;}
    }
}
