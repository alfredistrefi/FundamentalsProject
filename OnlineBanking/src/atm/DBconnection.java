/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
        
/**
 *
 * @author techcom
 */
public class DBconnection {
    public static Connection connect(){
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:8889/names", "root","root");
            System.out.println("Connected with the db!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null , "The error was:" + e); //Displays the error message!
        } 
        return con;
        }

    static ResultSet getData(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void setDataOrDelete(String query, String password_changed_successfully) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }
    
       
