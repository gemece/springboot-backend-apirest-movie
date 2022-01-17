package com.springboot.backend.apirest.movie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class MovieEntity {
	@Id
    @Column(name = "movie_id")
    private Long movieId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
