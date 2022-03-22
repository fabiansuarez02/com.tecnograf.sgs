import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        String databaseURL = "jdbc:ucanaccess://C://Codigo//DBSGS//SGS_DB.mdb";

        try (Connection connection = DriverManager.getConnection(databaseURL)) {
             
            System.out.println("Conexion exitosa"); 

            String sql = null;
                                  
            sql = "SELECT RAZONSOCIAL FROM CLIENTES";
             
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
             
            while (result.next()) {
            
                String razonsocial = result.getString("RAZONSOCIAL");
                 
                System.out.println("*/" + razonsocial + "/*");
            }
                
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Conexion Fallida");
        }
    }
}
