package Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataSourceTest extends MyDataSourceFactory{

    public static void main(String[] args) {
        DataSourceTest data = new DataSourceTest();
        try {
            String dados = data.testDataSource();
            System.out.println(dados);

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private String testDataSource() throws SQLException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder();
        String query = "select name from people";

        PreparedStatement preparedStmtSelect = super.conexao().prepareStatement(query);
        preparedStmtSelect.execute();

        ResultSet rs = preparedStmtSelect.getResultSet();

        while (rs.next()) {
            sb.append(rs.getString("name")).append(" ");
        }

        super.conexao().close();

        return sb.toString();
    }

}
