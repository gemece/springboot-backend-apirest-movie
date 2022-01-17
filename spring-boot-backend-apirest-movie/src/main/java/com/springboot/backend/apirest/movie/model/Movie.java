package com.springboot.backend.apirest.movie.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {

    @JsonProperty("title")
    private String title;

    @JsonProperty("original_title")
    private String originalTitle;

    @JsonProperty("popularity")
    private float popularity;

    @JsonProperty("release_date")
    private String releaseDate;

    @JsonProperty("adult")
    private boolean adult;

    @JsonProperty("budget")
    private long budget;

    @JsonProperty("genre_ids")
    private List<Long> genres;

    @JsonProperty("homepage")
    private String homepage;

    @JsonProperty("overview")
    private String overview;

    @JsonProperty("original_language")
    private String originalLanguage;

    @JsonProperty("rating")
    private float userRating;

    @JsonProperty("status")
    private String status;

    @JsonProperty("id")
    private Long id;

	public String getTitle() {
		return title;
	}

	public String getOriginalTitle() {
		return originalTitle;
	}

	public float getPopularity() {
		return popularity;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public boolean isAdult() {
		return adult;
	}

	public long getBudget() {
		return budget;
	}

	public List<Long> getGenres() {
		return genres;
	}

	public String getHomepage() {
		return homepage;
	}

	public String getOverview() {
		return overview;
	}

	public String getOriginalLanguage() {
		return originalLanguage;
	}

	public float getUserRating() {
		return userRating;
	}

	public String getStatus() {
		return status;
	}

	public Long getId() {
		return id;
	}
    
    
}