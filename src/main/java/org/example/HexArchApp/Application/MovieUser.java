package org.example.HexArchApp.Application;

import org.example.HexArchApp.Domain.MovieSearchRequest;
import org.example.HexArchApp.Ports.IUserInput;

public class MovieUser {
    private IUserInput userInputDriverPort;

    public MovieUser(IUserInput userInputDriverPort) {
        this.userInputDriverPort = userInputDriverPort;
    }

    public void processInput(MovieSearchRequest movieSearchRequest)
    {
        userInputDriverPort.handleUserInput(movieSearchRequest);
    }
}
