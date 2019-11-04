package com.example.moviedb.service;

import com.example.moviedb.model.Movie;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MovieService {

    @GET("/movie/{movie_id}")
    Call<Movie> getMovieById(@Path("movie_id")String movieId);


/**
 *
 * Media Type	Description
 * all	       --Include all movies, TV shows and people in the results as a global trending list.
 * movie	   --Show the trending movies in the results.
 * tv	       --Show the trending TV shows in the results.
 * person	   --Show the trending people in the results.
 *
 **/
    @GET("/trending/{media_type}/{time_window}")
    Call<Movie> getTrending(
            @Path("media_type")String mediaType,
            @Path("time_window")String timeWindow);


}
