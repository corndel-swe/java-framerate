package com.corndel.framerate.repositories;

import com.corndel.framerate.DB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class Repository<T> {

  public abstract T resultSetToDto(ResultSet resultSet) throws SQLException;

  public List<T> findAll(String query) throws SQLException {
    try (var con = DB.getConnection();
        var stmt = con.createStatement();
        var rs = stmt.executeQuery(query)) {

      var results = new ArrayList<T>();
      while (rs.next()) {
        results.add(resultSetToDto(rs));
      }
      return results;
    }
  }

  public T findByInt(String query, int i) throws SQLException {
    try (var con = DB.getConnection();
        var stmt = con.prepareStatement(query)) {

      stmt.setInt(1, i);

      try (var rs = stmt.executeQuery()) {
        if (!rs.next()) {
          return null;
        }
        return resultSetToDto(rs);
      }
    }
  }

  public List<T> findAllByInt(String query, int i) throws SQLException {
    try (var con = DB.getConnection();
        var stmt = con.prepareStatement(query)) {

      stmt.setInt(1, i);

      try (var rs = stmt.executeQuery()) {
        var results = new ArrayList<T>();
        while (rs.next()) {
          results.add(resultSetToDto(rs));
        }
        return results;
      }
    }
  }
}
