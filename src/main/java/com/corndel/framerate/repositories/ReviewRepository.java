package com.corndel.framerate.repositories;

import com.corndel.framerate.models.Review;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.function.Function;

public class ReviewRepository extends Repository {

  private final Function<ResultSet, Review> mapper = rs -> {
    try {
      return Review.of(rs);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  };

  public List<Review> findByMovie(int movieId) throws SQLException {
    var query = "SELECT * FROM REVIEWS WHERE movieId = ?";
    return findAllByInt(query, movieId, mapper);
  }
}
