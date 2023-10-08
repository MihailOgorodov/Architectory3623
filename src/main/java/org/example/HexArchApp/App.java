package org.example.HexArchApp;
import org.example.HexArchApp.Adapters.ConsolePrinter;
import org.example.HexArchApp.Adapters.MovieReviewsRepo;
import org.example.HexArchApp.Adapters.UserCommand;
import org.example.HexArchApp.Application.MovieUser;
import org.example.HexArchApp.Domain.MovieSearchRequest;
import org.example.HexArchApp.Ports.IFetchMovieReviews;
import org.example.HexArchApp.Ports.IPrintMovieReviews;
import org.example.HexArchApp.Ports.IUserInput;

public class App {
    public static void main(String[] args) throws Exception {

        IFetchMovieReviews fetchMovieReviews = new MovieReviewsRepo();
        IPrintMovieReviews printMovieReviews = new ConsolePrinter();

        IUserInput userCommand = new UserCommand(fetchMovieReviews, printMovieReviews);

        MovieUser movieUser = new MovieUser(userCommand);

        MovieSearchRequest starWarsRequest = new MovieSearchRequest("StarWars");
        MovieSearchRequest starTreckRequest = new MovieSearchRequest("StarTreck");

        System.out.println("Displaying reviews for movie " + starWarsRequest.getMovieName());
        movieUser.processInput(starWarsRequest);

        System.out.println("Displaying reviews for movie " + starTreckRequest.getMovieName());
        movieUser.processInput(starTreckRequest);
        // System.out.println("Hello, World!");
    }
}
