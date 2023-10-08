package org.example.HexArchApp.Ports;

import org.example.HexArchApp.Domain.MovieReview;
import org.example.HexArchApp.Domain.MovieSearchRequest;

import java.util.List;

public interface IFetchMovieReviews {
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest);
}
