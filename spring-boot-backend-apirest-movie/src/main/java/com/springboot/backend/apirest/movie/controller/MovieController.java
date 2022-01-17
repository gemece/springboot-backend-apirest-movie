package com.springboot.backend.apirest.movie.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import com.springboot.backend.apirest.movie.model.Movie;
import com.springboot.backend.apirest.movie.service.impl.MovieServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = { "http://localhost:8080" })
public class MovieController {
	
    @Autowired
    private MovieServiceImpl movieService;

    @GetMapping
    public List<Movie> getAllTopRatedMovies(){
       return movieService.fetchMovieList();
    }

    @Secured("ROLE_ADMIN")
    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable("id") Long id){
        return movieService.fetchMovieById(id);
    }

    @Secured("ROLE_ADMIN")
    @GetMapping("/search")
    public List<Movie> getMovieSearchResult(@RequestParam("query") String query){
        return movieService.fetchMoviesBySearchQuery(query);
    }
    
    @Secured({"ROLE_ADMIN", "ROLE_USER"})
    @GetMapping("/popular")
    public List<Movie> getPopularMovies(){
       return movieService.fetchPopularMovieList();
    }
}