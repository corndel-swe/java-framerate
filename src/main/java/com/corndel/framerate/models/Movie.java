package com.corndel.framerate.models;

import java.time.LocalDate;

public class Movie {
  public enum Genre {
    Adventure,
    Action,
    Animation,
    Biography,
    Crime,
    Drama,
    Fantasy,
    History,
    Horror,
    Mystery,
    Romance,
    War
  }

  public Movie() {}

  public Movie(
      int id,
      String title,
      LocalDate releaseDate,
      String ageRating,
      Genre genre,
      int runtime,
      String imageURL) {
    this.id = id;
    this.title = title;
    this.releaseDate = releaseDate;
    this.ageRating = ageRating;
    this.genre = genre;
    this.runtime = runtime;
    this.imageURL = imageURL;
  }

  private int id;
  public String title;
  public LocalDate releaseDate;
  public String ageRating;
  public Genre genre;
  public int runtime;
  public String imageURL;
}
