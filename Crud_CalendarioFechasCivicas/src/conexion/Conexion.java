/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author RYZEN
 */
public class Conexion {
    Connection cn;
    
   public Conexion(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost:33060/db_consultas", "root", "oscar");
    } catch (Exception e)  {
            System.out.println("Error:"+ e);
    }
  }    
   public Connection getConnection(){
       return cn;
   }
}
