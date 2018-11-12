package model;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MovieListModel {
	private ObservableList<Movie> items;
	
	public MovieListModel() {
		items = FXCollections.observableArrayList();
	}
	
	public void addMovie(Movie movie) {
		items.add(movie);
	}
	
	public ObservableList<Movie> getMovieList() {
		return items;
	}

}
