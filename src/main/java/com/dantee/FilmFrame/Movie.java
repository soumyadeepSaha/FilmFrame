package com.dantee.FilmFrame;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

//instead of writing getters and setters for each of the private properties  we use @Data
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "movie")    //this will let the framework know that this class sheet presents each document in the movie collection
public class Movie {

     @Id  //give the uniqe identifier @Id for each movie
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String>genres; //this will be genres as their will be multiple genres of the same movies
    private List<String> backdrops; //these images will be used in the frontend app
    private List<Review> reviewIds; // if we write like this this will be an embedded relationship so all the reiew which are related to the movies will be added to this list of reviews(one to many relationship) one movie can have many reviews but we will show framework power with (@DocumentReference)--> this will let data base to store only ids of the review and the reviews will be in a seperate collection.  so this is called manual reference relation ship



}
