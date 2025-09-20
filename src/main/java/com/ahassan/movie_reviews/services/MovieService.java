package com.ahassan.movie_reviews.services;

import com.ahassan.movie_reviews.models.Movie;
import com.ahassan.movie_reviews.repositories.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    // Create
    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}