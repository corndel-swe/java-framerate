package com.corndel.framerate.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Review {
  private int id;
  private int movieId;
  private long createdAt;
  private int rating;
  private String content;

  public Review() {
  }

  public Review(int id, int movieId, long createdAt, int rating, String content) {
    this.id = id;
    this.movieId = movieId;
    this.createdAt = createdAt;
    this.rating = rating;
    this.content = content;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getMovieId() {
    return movieId;
  }

  public void setMovieId(int movieId) {
    this.movieId = movieId;
  }

  public long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(long createdAt) {
    this.createdAt = createdAt;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public static Review of(ResultSet rs) throws SQLException {
    var id = rs.getInt("id");
    var movieId = rs.getInt("movieId");
    var createdAt = rs.getLong("createdAt");
    var rating = rs.getInt("rating");
    var content = rs.getString("content");

    return new Review(id, movieId, createdAt, rating, content);
  }
}
