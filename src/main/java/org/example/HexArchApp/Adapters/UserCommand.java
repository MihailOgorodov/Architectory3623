package org.example.HexArchApp.Adapters;

import org.example.HexArchApp.Application.MovieApp;
import org.example.HexArchApp.Domain.Model;
import org.example.HexArchApp.Domain.MovieSearchRequest;
import org.example.HexArchApp.Ports.IFetchMovieReviews;
import org.example.HexArchApp.Ports.IPrintMovieReviews;
import org.example.HexArchApp.Ports.IUserInput;

public class UserCommand implements IUserInput {
    private Model model;

    public UserCommand(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        MovieApp movieApp = new MovieApp(fetchMovieReviews, printMovieReviews);
        this.model = new Model(movieApp);
    }

    public void handleUserInput(Object userCommand) {
        model.Run((MovieSearchRequest)userCommand);
    }
}