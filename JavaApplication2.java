/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try{ 
            Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@172.16.0.70:1521:CAS","fdp37","fdp37");
            if(con!=null)
            {
                        System.out.println("connection established");
            }
            else
              System.out.println("connection not established");
  
//step3 create the statement object  
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from addressbook"); 
            while(rs.next())  
System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
            con.close();  
        }catch(SQLException e){System.out.println(e);}  
           
        
        }
        
    }
    

