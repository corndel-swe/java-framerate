package com.corndel.framerate.repositories;

import com.corndel.framerate.models.Review;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ReviewRepository extends Repository<Review> {

  @Override
  public Review resultSetToDto(ResultSet resultSet) throws SQLException {
    return Review.of(resultSet);
  }

  public List<Review> findByMovie(int movieId) throws SQLException {
    var query = "SELECT * FROM REVIEWS WHERE movieId = ?";
    return findAllByInt(query, movieId);
  }
}
