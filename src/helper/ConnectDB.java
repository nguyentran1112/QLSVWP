/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;
import Dao.Peopledao;

/**
 *
 * @author LENOVO
 */
public class ConnectDB {
    public static Connection openConnection() throws Exception{
        
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=SV";
            String user = "sa";
            String pass = "12345";
            Connection conn = DriverManager.getConnection(url,user,pass);
            return conn;
}
}
