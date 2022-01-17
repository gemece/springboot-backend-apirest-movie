package com.springboot.backend.apirest.movie.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.springboot.backend.apirest.movie.model.*;
import com.springboot.backend.apirest.movie.service.MovieService;

import java.net.URI;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService<Movie> {
    @Value("${apikey}")
    private String ApiKey;

    @Value("${base_url}")
    private String BaseUrl;

    @Value("${top_rated_movie_url}")
    private String topRatedMovieUrl;

    @Value("${search_movie_url}")
    private String SearchMovieUrl;

    @Value("${movie_id_url}")
    private String MovieIdUrl;
    
    @Value("${popular_movie_url}")
    private String popularMovieUrl;

    @Autowired
    private RestTemplate restTemplate;
    
    @Override
    public List<Movie> fetchMovieList() {
        UriComponents uriComponents =
                UriComponentsBuilder.fromUriString(topRatedMovieUrl).build()
                        .expand(BaseUrl, ApiKey)
                        .encode();

        URI uri = uriComponents.toUri();
        ListMovies movieResults = restTemplate.getForObject(uri, ListMovies.class);
        return movieResults.getListMovies();
    }

    @Override
    public Movie fetchMovieById(Long id) {
        UriComponents uriComponents =
                UriComponentsBuilder.fromUriString(MovieIdUrl).build()
                        .expand(BaseUrl, id, ApiKey)
                        .encode();

        URI uri = uriComponents.toUri();
        Movie movie = restTemplate.getForObject(uri, Movie.class);
        return movie;
    }

    @Override
    public List<Movie> fetchMoviesBySearchQuery(String query) {
        UriComponents uriComponents =
                UriComponentsBuilder.fromUriString(SearchMovieUrl).build()
                        .expand(BaseUrl, ApiKey, query)
                        .encode();

        URI uri = uriComponents.toUri();

        ListMovies movieResults = restTemplate.getForObject(uri,ListMovies.class);
        return movieResults.getListMovies();
    }

    @Override
	public List<Movie> fetchPopularMovieList() {
		UriComponents uriComponents =
                UriComponentsBuilder.fromUriString(popularMovieUrl).build()
                        .expand(BaseUrl, ApiKey)
                        .encode();

        URI uri = uriComponents.toUri();
        ListMovies movieResults = restTemplate.getForObject(uri, ListMovies.class);
        return movieResults.getListMovies();
	}

}
