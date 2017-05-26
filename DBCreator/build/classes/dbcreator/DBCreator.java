/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcreator;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author emilio
 */
public class DBCreator {

    
    
    public static void main(String[] args){
            JOptionPane.showMessageDialog(null, "Bienvenido al creador de base de datos cwm!!!");
            int ax = JOptionPane.showConfirmDialog(null, "Deseas crear la base de datos?");
            if(ax == JOptionPane.YES_OPTION){  
                String driver="com.mysql.jdbc.Driver";
                String cadenaConeccion="jdbc:mysql://127.0.0.1/";
                String usuario="root";
                String contraseña="";
                Connection con, con2;
                Statement sentencia = null;
                try{
                    Class.forName(driver);
                    con=DriverManager.getConnection(cadenaConeccion, usuario, contraseña);
                    sentencia = con.createStatement();
                    sentencia.executeUpdate("CREATE DATABASE cwm"); 
                    cadenaConeccion="jdbc:mysql://127.0.0.1/cwm";
                    con2=DriverManager.getConnection(cadenaConeccion, usuario, contraseña);
                    sentencia = con2.createStatement();
                    String sql="create table usuarios("+
                                "	id int NOT NULL AUTO_INCREMENT," +
                                "  	user varchar(50) NOT NULL," +
                                "  	pass varchar(50) NOT NULL," +
                                "  	fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP," +
                                "  	PRIMARY KEY (id)" +
                                ")";
                    sentencia.executeUpdate(sql);
                    sql=        "create table infousuarios( " +
                                "	id int NOT NULL AUTO_INCREMENT," +
                                "	nombre varchar(50) NOT NULL," +
                                "	apellido varchar(50) NOT NULL," +
                                "	colonia varchar(50) NOT NULL," +
                                "	calleYnumero varchar(50) NOT NULL," +
                                "	tel bigint(20) NOT NULL, PRIMARY KEY (id)," +
                                "	FOREIGN KEY (id) REFERENCES usuarios(id)" +
                                ")";
                    sentencia.executeUpdate(sql);
                    sql="create table solicitudes(" +
                                "    numeroSolicitud int NOT NULL AUTO_INCREMENT," +
                                "    idUsuario int NOT NULL," +
                                "    nombre varchar(50)," +
                                "    apellido varchar(50)," +
                                "    colonia varchar(50)," +
                                "    calleYnumero varchar(50)," +
                                "    tel bigint(20)," +
                                "    cantidadServicio int NOT NULL," +
                                "    costo int NOT NULL," +
                                "    fechaRequerida TIMESTAMP," +
                                "    ordenStatus varchar(20)," +
                                "    fechaOrden TIMESTAMP DEFAULT CURRENT_TIMESTAMP," +
                                "    PRIMARY KEY (numeroSolicitud)," +
                                "    FOREIGN KEY (idUsuario) REFERENCES infousuarios(id)" +
                                ")";
                    sentencia.executeUpdate(sql);
                    sql="create table trabajadores(" +
                        "    numeroEmpleado int NOT NULL AUTO_INCREMENT," +
                        "    user varchar(50)," +
                        "    pass varchar(50)," +
                        "    puesto int NOT NULL," +
                        "    nombre varchar(20)," +
                        "    apellido varchar(20)," +
                        "    telefono bigint(20)," +
                        "    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP ," +
                        "    PRIMARY KEY (numeroEmpleado)" +
                        " )";
                    sentencia.executeUpdate(sql);
                    sql="INSERT INTO trabajadores (user, pass, puesto, nombre, apellido, telefono) VALUES ('admin','admin123', '2', 'My', 'Pc', '127001')";
                    sentencia.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Base de datos creada con exito.");
                    sql="INSERT INTO usuarios (user, pass) VALUES ('user', '12345')";
                    sentencia.executeUpdate(sql);
                    sql="INSERT INTO infousuarios (nombre, apellido, colonia, calleYnumero, tel) VALUES ('user', 'master', 'NaN', 'NaN', '0')";
                    sentencia.executeUpdate(sql);
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "No se ha podido establecer una coneccion con la BD"+e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se creo la base de datos.");
        }
            

    }
    
}
