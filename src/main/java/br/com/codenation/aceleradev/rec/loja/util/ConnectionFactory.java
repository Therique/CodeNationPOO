package br.com.codenation.aceleradev.rec.loja.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static String url = "jdbc:mysql://db4free.net:3306/adminproj";
    private static String username = "adminproj";
    private static String password = "FSFU06hq";

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

	}

