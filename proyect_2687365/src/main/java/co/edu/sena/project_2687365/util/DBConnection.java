package co.edu.sena.project_2687365.util;

import java.sql.SQLDataException;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/myapp?serverTimezone-America/Bogota";

    private static final String USER = "myapp_user";

    private static final String PASS = "myapp_password";

    private static BasicDataSource pool;

    private static BasicDataSource getInstance() throws SQLDataException {

        if (pool == null) {

            pool = new BasicDataSource();

            pool.setUrl(URL);
            pool.setUsername(USER);
            pool.setPassword(PASS);

            pool.setInitialSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(8);
            pool.setMaxTotal

        }
        return pool;
    }

    public static Connection getConnection() throws SQLException {
        return getInstance().getConnection();
    }
}


