import java.sql.*;
import javax.swing.*;

public class javaConnect {
    static Connection cn = null;
    public static Connection ConnectDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            cn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dt\\Documents\\NetBeansProjects\\Cab reservation\\Cab Reservation.sqlite");
            //  JOptionPane.showMessageDialog(null,"Connection established");
            return cn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
  
