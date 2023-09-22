package data;
import java.sql.*;

public class RetriveData {
    public static ResultSet resultSet;
    DataBaseData dataBaseData ;
    PreparedStatement statement;
    Connection connection;
    public void retriveData(){
        dataBaseData = new DataBaseData();
        try {
            connection = DriverManager.getConnection(dataBaseData.jdbcUrl, dataBaseData.username, dataBaseData.password);
            String sql = "SELECT * FROM students;";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void close() throws SQLException {
        resultSet.close();
        statement.close();
        connection.close();
    }
}
