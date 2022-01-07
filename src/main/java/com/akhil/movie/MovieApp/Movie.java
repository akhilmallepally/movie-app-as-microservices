package com.akhil.movie.MovieApp;
import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Movie 
{
	@Id
	private BigInteger movieId;
	private String moviename;
	private String director;
	
	public Movie() {
		
	}

	public BigInteger getMovieId() {
		return movieId;
	}

	public void setMovieId(BigInteger movieId) {
		this.movieId = movieId;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	
}
