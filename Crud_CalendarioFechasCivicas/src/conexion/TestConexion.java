/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;

/**
 *
 * @author RYZEN
 */
public class TestConexion {

    public static void main(String[] args) {
         Conexion conexionDB = new Conexion();
        Connection connection = conexionDB.getConnection();

        if (connection != null) {
            System.out.println("Conexión exitosa a la base de datos.");
        } else {
            System.out.println("Error al conectar a la base de datos.");
        }
    }
    
}
