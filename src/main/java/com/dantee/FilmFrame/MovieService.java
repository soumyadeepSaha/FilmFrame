package com.dantee.FilmFrame;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {


        @Autowired // by this we will want to let the frame work know that we want it to instantiate the class
        private MovieRepository movieRepository;
        //now inside the service claas  we need a reference of the repository

    public List<Movie> allMovies() {

         return movieRepository.findAll();

    }


}
