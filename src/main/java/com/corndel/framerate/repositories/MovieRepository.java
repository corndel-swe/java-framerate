package com.corndel.framerate.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.function.Function;

import com.corndel.framerate.models.Movie;

public class MovieRepository extends Repository {

  private final Function<ResultSet, Movie> mapper = rs -> {
    try {
      return Movie.of(rs);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  };

  public List<Movie> findAll() throws SQLException {
    var query = "SELECT * FROM MOVIES";
    return findAll(query, mapper);
  }

  public Movie findById(int id) throws SQLException {
    var query = "SELECT * FROM MOVIES WHERE id = ?";
    return findByInt(query, id, mapper);
  }
}
