/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.LearningPlatfrom.lms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author zeena
 */
public class LMS {

    public static void main(String[] args) {
        /*try {
            System.out.println("hello");
            String url="jdbc:mysql://localhost:3306/learning?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection con=DriverManager.getConnection(url, "root", "");
            String sql="CREATE TABLE enrolled ( course_id INT, username VARCHAR(50),"
                    + "PRIMARY KEY (course_id,username),"
                    + "FOREIGN KEY (course_id) REFERENCES course(course_id) ON DELETE CASCADE ON UPDATE CASCADE,"
                    + "FOREIGN KEY (username) REFERENCES signup(username) ON DELETE CASCADE ON UPDATE CASCADE);";
            PreparedStatement st=con.prepareStatement(sql);
            
            st.executeUpdate();
            System.out.println("suessfully reated");
            con.close();
        } catch (SQLException ex) {
            System.getLogger(LMS.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }*/
        
    }
}
