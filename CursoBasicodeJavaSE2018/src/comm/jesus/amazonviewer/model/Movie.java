package comm.jesus.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Movie extends Film implements IVisualizable{
	
	private int id;
	private int timeViewed;
	
	public Movie(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration);
		setYear(year);
	}


	@Override
	public String toString() {
		
		return "Movie [id=" + id + ", timeViewed=" + timeViewed + ", getTitle()=" + getTitle() + ", getGenre()="
				+ getGenre() + ", getCreator()=" + getCreator() + ", getDuration()=" + getDuration() + ", getYear()="
				+ getYear() + ", isViewed()=" + isViewed() + "]";
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getTimeViewed() {
		return timeViewed;
	}



	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}


	@Override
	public Date starToSee(Date dateI) {
		// TODO Auto-generated method stub
		return new Date();
	}


	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if(dateF.getTime()> dateI.getTime()) {
			setTimeViewed((int) (dateF.getTime()-dateI.getTime()));
		}else {
			setTimeViewed(0);
		}
	}
	public static ArrayList<Movie> makeMoviesList(){
		ArrayList<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie("Movie 1", "genre", "creator 1", 20, (short)2017));
		movies.add(new Movie("Movie 2", "genre", "creator 2", 21, (short)2018));
		movies.add(new Movie("Movie 3", "genre", "creator 3", 22, (short)2019));
		movies.add(new Movie("Movie 4", "genre", "creator 4", 23, (short)2020));
		movies.add(new Movie("Movie 5", "genre", "creator 5", 24, (short)2021));
		return movies;
	}
}
