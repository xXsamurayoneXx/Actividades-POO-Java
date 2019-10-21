package practica5;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class JavaMysqlInsertExample {


    public static void main(String[] args) {
        try 
        {
            String myDriver = "org.gjt.mm.mysql.Driver";
            String MyUrl = "jdbc:mysql://localhost/test";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(MyUrl, "root", "kiseijuu123");
            
            Statement st = (Statement) conn.createStatement();
            st.execute();
            conn.close();
        }
        catch (Exception e)
        {
            System.err.println("Error al conectar a la base de datos");
            System.err.println(e.getMessage());
        }
    }
    
}
