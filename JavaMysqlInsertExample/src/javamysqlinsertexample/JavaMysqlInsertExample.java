package javamysqlinsertexample;

public class JavaMysqlInsertExample {


    public static void main(String[] args) {
        try 
        {
            String myDriver = "org.gjt.mm.mysql.Driver";
            String MyUrl = "jdbc:mysql://localhost/test";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            
            Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO users (first_name, last_name, is_admin, num_points)" + "VALUES ('Fred' , 'Flinstone', false, 10000)");
            conn.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }
    
}
