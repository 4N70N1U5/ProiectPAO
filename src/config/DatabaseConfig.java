package config;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static constants.Constante.FISIER_CONEXIUNE_BD;

public class DatabaseConfig {
    private static DatabaseConfig instance;
    private Connection databaseConnection;

    private DatabaseConfig() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FISIER_CONEXIUNE_BD));

            String[] dbInfo = reader.readLine().split(",");

            String url = dbInfo[0].trim();
            String username = dbInfo[1].trim();
            String password = dbInfo[2].trim();

            databaseConnection = DriverManager.getConnection(url, username, password);
        }
        catch (IOException e) {
            System.out.println("Informatiile pentru conexiunea la baza de date nu au putut fi citite.");
        }
        catch (SQLException e) {
            System.out.println("Conexiunea la baza de date nu a putut fi realizata.");
        }
    }

    public static DatabaseConfig getInstance() {
        if (instance == null)
            instance = new DatabaseConfig();

        return instance;
    }

    public Connection getDatabaseConnection() {
        return databaseConnection;
    }
}
