package com.springboot.backend.apirest.movie.service;

import java.util.List;

public interface MovieService<E> {
    List<E> fetchMovieList();
    
    List<E> fetchPopularMovieList();

    E fetchMovieById(Long id);

    List<E> fetchMoviesBySearchQuery(String query);
}