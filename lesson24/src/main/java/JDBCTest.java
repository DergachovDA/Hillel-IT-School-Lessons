import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCTest {

    public static void main(String[] args) throws SQLException, IOException {

        JDBCTest jdbcTest = new JDBCTest();
        Properties properties = jdbcTest.loadProperties();


        Connection connection = DriverManager.
                getConnection(properties.getProperty("url"),
                        properties.getProperty("username"),
                        properties.getProperty("password"));

//        jdbcTest.addStudent(connection);
        jdbcTest.printStudents(connection);
//        jdbcTest.trasactionExample(connection);
//        jdbcTest.batchingExample(connection);
    }

    private Properties loadProperties() throws IOException{
        Properties properties = new Properties();
        InputStream stream = this.getClass().getResourceAsStream("db.properties");
        properties.load(stream);
        return properties;
    }
    public void printStudents(Connection connection) throws SQLException {
        String sql = "SELECT * FROM students";
        Statement statement = connection.createStatement();
        statement.execute(sql);

        ResultSet resultSet = statement.getResultSet();

        while (resultSet.next()) {
            String str = "";
            str += resultSet.getString("id") + ", ";
            str += resultSet.getString("lastname") + ", ";
            str += resultSet.getString("firstname") + ", ";
            str += resultSet.getString("age");
            System.out.println(str);
        }
    }

    public void addStudent (Connection connection) throws SQLException {
        String sql = "insert into students (lastname, firstname, age) values (?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "Sidorov");
        preparedStatement.setString(2, "Semen");
        preparedStatement.setInt(3, 45);

        preparedStatement.execute();
    }

    public void trasactionExample(Connection connection) throws SQLException {
        String sql1 = "insert into accounts(summa, user_id) values(500, 1)";
        String sql2 = "insert into accounts(summa, user_id) values(200, 2)";

        connection.setAutoCommit(false);

        Statement statement = connection.createStatement();

        try {
            statement.executeUpdate(sql1);
            statement.executeUpdate(sql2);
            connection.commit();
        } catch (Exception e) {
            connection.rollback();
        } finally {
            connection.setAutoCommit(true);
        }
    }

    public void batchingExample(Connection connection) throws SQLException {
        String sql = "insert into accounts(summa, user_id) values(?, ?)";
        connection.setAutoCommit(false);
        PreparedStatement statement = connection.prepareStatement(sql);

        for (int i = 0; i < 9; i++) {
            statement.setInt(1, 100 + i);
            statement.setInt(2, i + 2);
            statement.addBatch();
        }

        statement.executeBatch();
    }
}
