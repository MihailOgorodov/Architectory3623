package org.example.HexArchApp.Adapters;

import org.example.HexArchApp.Domain.MovieReview;
import org.example.HexArchApp.Domain.MovieSearchRequest;
import org.example.HexArchApp.Ports.IFetchMovieReviews;

import java.util.*;

import static jdk.internal.misc.OSEnvironment.initialize;

public class MovieReviewsRepo implements IFetchMovieReviews {
    private Map<String, List<MovieReview>> movieReviewMap;

    public MovieReviewsRepo() {
        initialize();
    }

    private void initialize() {
        this.movieReviewMap = new HashMap<>();
        movieReviewMap.put("StarWars", Collections.singletonList(new MovieReview("1", 7.5, "Good")));
        movieReviewMap.put("StarTreck", Arrays.asList(new MovieReview("1", 9.5, "Excellent"), new MovieReview("1", 8.5, "Good")));
    }

    @Override
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest) {
        return Optional.ofNullable(movieReviewMap.get(movieSearchRequest.getMovieName()))
                .orElse(new ArrayList<>());
    }
}
