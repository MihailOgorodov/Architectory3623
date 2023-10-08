package org.example.HexArchApp.Ports;

import org.example.HexArchApp.Domain.MovieReview;

import java.util.List;

public interface IPrintMovieReviews {
    public void writeMovieReviews(List<MovieReview> movieReviewList);
}
