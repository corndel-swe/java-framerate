package com.corndel.framerate;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
  private final String dbUrl;

  public DB() throws IOException {
    this(new Config());
  }

  public DB(Config config) throws IOException {
    dbUrl = config.getProperty("db.url");
  }

  public Connection getConnection() throws SQLException {
    return DriverManager.getConnection(dbUrl);
  }
}
