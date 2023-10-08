package org.example.HexArchApp.Adapters;

import org.example.HexArchApp.Domain.MovieReview;
import org.example.HexArchApp.Ports.IPrintMovieReviews;

import java.util.List;

public class ConsolePrinter implements IPrintMovieReviews {
    @Override
    public void writeMovieReviews(List<MovieReview> movieReviewList) {
        movieReviewList.forEach(movieReview -> {
            System.out.println(movieReview.toString());
        });

    }
}
