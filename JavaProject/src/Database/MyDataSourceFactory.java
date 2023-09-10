package Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class MyDataSourceFactory {
    String url = "jdbc:mysql://localhost:3306/java_database";
    String username = "root";
    String password = "";
    String driver = "com.mysql.cj.jdbc.Driver";


    public Connection conexao() throws ClassNotFoundException, SQLException{
        Class.forName(driver);

        Connection conn = DriverManager.getConnection(url, username, password);
        return conn;
    }
}

