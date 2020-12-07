package HW6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper {
    private final Connection connection;

    public UserMapper(Connection connection) {
        this.connection = connection;
    }

    public User getUser(int key) throws Exception {
        User person = IdentityMap.isInto(key);
        if (person != null) {
            return person;
        } else {
            User userDb = findById(key);
            IdentityMap.addMap(userDb);
            return userDb;
        }
    }

    public User findById(int key) throws SQLException {
        User user = new User();
        PreparedStatement statement;
        statement = connection.prepareStatement(
                "SELECT iduser, firstname, lastname, age FROM user WHERE iduser = ?");
        statement.setInt(1, key);

        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {

            user.setIdUser(resultSet.getInt(1));
            user.setFirstName(resultSet.getString(2));
            user.setLastName(resultSet.getString(3));
            user.setAge(resultSet.getInt(4));
        }
        return user;
    }

    public void insert(String firstName, String lastName, int age) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO `user` (`firstname`, `lastname`, `age`) VALUES (?, ?, ?);");
        statement.setString(1, firstName);
        statement.setString(2, lastName);
        statement.setInt(3, age);
        int resultSet = statement.executeUpdate();
    }

    public void update(int iduser, int age) throws SQLException {
//        Упрощенный вариант с изменением одного параметра
        PreparedStatement statement = connection.prepareStatement(
                "UPDATE `user` SET `age` = ? WHERE (`iduser` = ?);");
        statement.setInt(2, iduser);
        statement.setInt(1, age);
        int resultSet = statement.executeUpdate();
    }

    public void delete(User user) {
//        Удаление строки в таблице
    }
}
