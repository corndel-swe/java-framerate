package com.corndel.framerate.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.corndel.framerate.models.Movie;

public class MovieRepository extends Repository<Movie> {

  @Override
  public Movie resultSetToDto(ResultSet resultSet) throws SQLException {
    return Movie.of(resultSet);
  }

  public List<Movie> findAll() throws SQLException {
    var query = "SELECT * FROM MOVIES";
    return findAll(query);
  }

  public Movie findById(int id) throws SQLException {
    var query = "SELECT * FROM MOVIES WHERE id = ?";
    return findByInt(query, id);
  }
}
