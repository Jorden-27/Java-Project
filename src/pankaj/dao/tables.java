/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pankaj.dao;

import javax.swing.JOptionPane;

/**
 *
 * @author panka
 */
public class tables {
    public static void main(String args[])
    {
        try{
            String userTable = "CREATE TABLE user2 (id INT AUTO_INCREMENT PRIMARY KEY,name VARCHAR(200) NOT NULL,email VARCHAR(200) NOT NULL UNIQUE,mobileNumber VARCHAR(10) NOT NULL,address VARCHAR(200) NOT NULL,password VARCHAR(200) NOT NULL,securityQuestion VARCHAR(200) NOT NULL,answer VARCHAR(200) NOT NULL,status VARCHAR(20) NOT NULL,CHECK (LENGTH(name) > 0),CHECK (LENGTH(mobileNumber) = 10),CHECK(LENGTH(address) > 0),CHECK (LENGTH(password) > 0),CHECK (LENGTH(securityQuestion) > 0),CHECK (LENGTH(answer) > 0),)\";" ;
            String adminDetails="Insert into user2(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('Admin','admin@gmail.com','1234567890','India','admin','What school did you attend?','abc','true')";
            DBOperations.setDataOrDelete(userTable, "User table created successfully");
            DBOperations.setDataOrDelete(adminDetails, "Admin details added successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog( null,e);
        }
    }
    
}
