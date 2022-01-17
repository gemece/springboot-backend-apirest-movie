package com.springboot.backend.apirest.movie.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.List;


public class ListMovies {

    @JsonProperty("results")
    List<Movie> listMovie;

	public List<Movie> getListMovies() {
		return listMovie;
	}

}

