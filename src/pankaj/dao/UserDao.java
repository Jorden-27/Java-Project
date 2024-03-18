/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pankaj.dao;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.User;
import java.sql.*;

/**
 *
 * @author panka
 */
public class UserDao {
    
    public static void save(User user){
        String query = "insert into user2 (name,email,mobileNumber,address,password,securityQuestion,answer,status) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getMobileNumber()+"','"+user.getAddress()+"','"+user.getPassword()+"','"+user.getSecurityQuestion()+"','"+user.getAnswer()+"','False')";
        DBOperations.setDataOrDelete(query, "Registered successfully!!");
    }
    
    
    public static User Login(String email,String password){
        User user=null;
        try{
            ResultSet rs = DBOperations.getData("SELECT * FROM user WHERE email = '" + email + "' AND password = '" + password + "'");
            while(rs.next()){
                user=new User();
                user.setStatus(rs.getString("status"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e,"Message",JOptionPane.ERROR_MESSAGE);
        }
        return user;
    }
    
    
    public static ResultSet getData(String query){
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null,e,"Message",JOptionPane.ERROR_MESSAGE);
           return null;
        }
    }
}
