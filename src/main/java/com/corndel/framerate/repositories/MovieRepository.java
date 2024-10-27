package com.corndel.framerate.repositories;

import com.corndel.framerate.DB;
import com.corndel.framerate.models.Movie;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
  public static List<Movie> findAll() throws SQLException {
    var query = "SELECT * FROM MOVIES";

    try (var con = DB.getConnection();
        var stmt = con.createStatement();
        var rs = stmt.executeQuery(query);) {

      var users = new ArrayList<Movie>();
      while (rs.next()) {
        var id = rs.getInt("id");
        var title = rs.getString("title");
        var releaseDate = rs.getDate("releaseDate").toLocalDate();
        var ageRating = rs.getString("ageRating");
        var genre = Movie.Genre.valueOf(rs.getString("genre"));
        var runtime = rs.getInt("runtime");
        var imageURL = rs.getString("imageURL");

        users.add(new Movie(id, title, releaseDate, ageRating, genre, runtime, imageURL));
      }

      return users;
    }
  }

  public static Movie findById(int id) throws SQLException {
    var query = "SELECT * FROM MOVIES WHERE id = ?";

    try (var con = DB.getConnection();
        var stmt = con.prepareStatement(query)) {
      stmt.setInt(1, id);
      try (var rs = stmt.executeQuery()) {
        if (!rs.next()) {
          return null;
        }
        var title = rs.getString("title");
        var releaseDate = rs.getDate("releaseDate").toLocalDate();
        var ageRating = rs.getString("ageRating");
        var genre = Movie.Genre.valueOf(rs.getString("genre"));
        var runtime = rs.getInt("runtime");
        var imageURL = rs.getString("imageURL");

        return new Movie(id, title, releaseDate, ageRating, genre, runtime, imageURL);
      }
    }
  }
}
