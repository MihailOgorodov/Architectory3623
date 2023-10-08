package org.example.HexArchApp.Domain;

import org.example.HexArchApp.Application.MovieApp;

public class Model {
    private MovieApp movieApp;

    public Model(MovieApp movieApp) {
        this.movieApp = movieApp;
    }

    public void Run(MovieSearchRequest userCommand)
    {
        movieApp.accept(userCommand);
    }
}
