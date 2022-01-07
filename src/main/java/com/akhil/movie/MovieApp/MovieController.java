package com.akhil.movie.MovieApp;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
	@Autowired
	private MovieRepository movieRepository;
	
	@RequestMapping("/")
	public String getMovieAppHome() {
		return ("Movie App Home");
	}
	
	@RequestMapping("/movies")
	public List<Movie> getMovies(){
		return movieRepository.findAll();
	}
	
	@RequestMapping("/{id}")
	public Movie getMovie(@PathVariable("id") BigInteger id) {
		return movieRepository.getOne(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value ="/movies")
	public void saveMovie(@RequestBody Movie movie) {
		movieRepository.save(movie);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value= "{id}")
	public void deleteMovie(@PathVariable BigInteger id) {
		movieRepository.deleteById(id);
	}
	
}
