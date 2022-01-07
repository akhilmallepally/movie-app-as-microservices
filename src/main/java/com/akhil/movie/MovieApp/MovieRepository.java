package com.akhil.movie.MovieApp;
import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, BigInteger>{

}
