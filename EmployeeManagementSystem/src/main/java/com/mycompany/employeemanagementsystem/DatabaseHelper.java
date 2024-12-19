package com.mycompany.employeemanagementsystem;

import java.sql.*;


// Singletone Design Pattern
public class DatabaseHelper {
    
    private static final String URL = "jdbc:sqlserver://PC-1:1433;databaseName=EmployeeSystem;encrypt=true;trustServerCertificate=true;integratedSecurity=true;";

    private static DatabaseHelper instance;

    private Connection connection;

    private DatabaseHelper() throws SQLException {
        this.connection = DriverManager.getConnection(URL);
    }

    public static synchronized DatabaseHelper getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseHelper();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
    
    public String getConnectionString() { // الدالة الجديدة
        return URL;
    }

    public void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
