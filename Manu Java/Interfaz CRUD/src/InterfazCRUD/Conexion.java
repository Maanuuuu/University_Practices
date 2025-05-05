package InterfazCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    Connection conectar=null;
    String usuario="ManuSQL";
    String contra="3105";
    String bd="dbEstudiantes";
    String ip="localhost";
    String puerto="1433";
    
    String cadena="jdbc:sqlserver://"+ip+":"+puerto+"/"+bd;
    
    int band=0;
    public Connection establecerConexion(){
        try{
           String cadena="jdbc:sqlserver://localhost:"+puerto+";"+"databaseName="+bd+";trustServerCertificate = true;";
           conectar=DriverManager.getConnection(cadena, usuario, contra);
           
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos"+e.toString());
            
        
        }
    return conectar;
    }
}
    

    
