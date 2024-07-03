package com.corndel.framerate.Models;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ligma {
    public static void doSomething() {
        var dbUrl = "jdbc:sqlite:framerate.db";

        try (Connection conn = DriverManager.getConnection(dbUrl)) {
            String sql = "SELECT 1";

            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {

                // loop through the result set
                while (rs.next()) {
                    System.out.println(rs.getInt(1));
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}