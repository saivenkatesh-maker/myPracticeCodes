package com.stackroute.domain;

public class Movie {
	
private String movieName;
private Actor actor;

public String getMovieName() {
	return movieName;
}

public void setMovieName(String movieName) {
	this.movieName = movieName;
}

public Movie(Actor actor) {
	super();
	this.actor = actor;
}

@Override
public String toString() {
	return "Movie [movieName=" + movieName + ", actor=" + actor + "]";
}



}
