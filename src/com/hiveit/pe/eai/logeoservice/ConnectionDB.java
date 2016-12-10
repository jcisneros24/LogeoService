package com.hiveit.pe.eai.logeoservice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.hiveit.pe.eai.logeoservice.exception.DBException;

public class ConnectionDB {
     public Connection getConnection() throws DBException{
        Connection response = null;
        String conector = "com.mysql.jdbc.Driver";                  
        String server = "localhost";
        String port = "3306";
        String db = "ssdb";
        String user = "root";
        String password = "12345";
        
        String url = "jdbc:mysql://"+server+":"+port+"/"+db;
        
        try{
            Class.forName(conector);
            response= DriverManager.getConnection(url, user, password);           
            
        	}catch (final ClassNotFoundException e) {
        		e.printStackTrace();
        	}catch (final SQLException e) {
	            if(e.getErrorCode() == 0){
	                JOptionPane.showMessageDialog(null, "El servidor de base de datos no responde.\n"
	                                                    + "Verifique que el servidor de base de datos este activo.\n"
	                                                    + "Tambien Verifique que exista la base de datos:"+db, 
	                                                    "Error: Coneccion Fallida.", JOptionPane.ERROR_MESSAGE);
	            }
        	}
        return response;
    }
}
