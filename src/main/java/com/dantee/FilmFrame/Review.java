package com.dantee.FilmFrame;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews") //now we havent created this collection yet but the applicaion itself has thje ability to create new collections)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    private ObjectId Id;

    private String body;

}
