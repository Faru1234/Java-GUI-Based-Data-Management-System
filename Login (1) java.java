import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@your_host:your_port:your_sid", "username", "password");
