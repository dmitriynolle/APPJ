package HW6;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        UserMapper userMapper = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
            String username = "";
            String password = "";
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                System.out.println("Connection to Store DB succesfull!");
                userMapper = new UserMapper(conn);
//                Достаем пользователя из базы
                User user = userMapper.getUser(3);
//                Достаем того же пользователя уже из MAP
                User user1 = userMapper.getUser(3);
//                Создаем пользователя
                userMapper.insert("Daniil", "Novikov", 4);
//                Изменяем пользователя
                userMapper.update(3, 10);
            }
        } catch (Exception ex) {
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }
}
