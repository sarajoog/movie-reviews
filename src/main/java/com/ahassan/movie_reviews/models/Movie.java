package com.ahassan.movie_reviews.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "movies")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false, length = 255)
    private String title;

    @Column(length = 1000)
    private String description;

    @Column(nullable = false, length = 100)
    private String director;

    @Column(name = "release_year")
    private Integer releaseYear;

    @Column(nullable = false, length = 50)
    private String genre;

    // FIX: Remove scale attribute for Double type
    @Column(precision = 3) // Only precision, no scale for floating-point types
    private Double rating;

    private Integer duration;

    @Column(name = "release_date")
    private String releaseDate;


}