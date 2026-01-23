package com.corndel.framerate.repositories;

import com.corndel.framerate.DB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public abstract class Repository {

  public <T> List<T> findAll(String query, Function<ResultSet, T> mapper) throws SQLException {
    try (var con = DB.getConnection();
        var stmt = con.createStatement();
        var rs = stmt.executeQuery(query)) {

      var results = new ArrayList<T>();
      while (rs.next()) {
        results.add(mapper.apply(rs));
      }
      return results;
    }
  }

  public <T> T findByInt(String query, int i, Function<ResultSet, T> mapper) throws SQLException {
    try (var con = DB.getConnection();
        var stmt = con.prepareStatement(query)) {

      stmt.setInt(1, i);

      try (var rs = stmt.executeQuery()) {
        if (!rs.next()) {
          return null;
        }
        return mapper.apply(rs);
      }
    }
  }

  public <T> List<T> findAllByInt(String query, int i, Function<ResultSet, T> mapper) throws SQLException {
    try (var con = DB.getConnection();
        var stmt = con.prepareStatement(query)) {

      stmt.setInt(1, i);

      try (var rs = stmt.executeQuery()) {
        var results = new ArrayList<T>();
        while (rs.next()) {
          results.add(mapper.apply(rs));
        }
        return results;
      }
    }
  }
}
