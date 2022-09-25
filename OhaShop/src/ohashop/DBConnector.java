/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohashop;

import java.sql.*;

public class DBConnector {
    
    private Connection con;
    
    
    public DBConnector(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/products","root", "");
            
            
        }catch(Exception ex){
            System.out.println("Erro: "+ex);
        }
    }
}
