package model;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MovieListModel {
	private ObservableList<Movie> items;
	
	public MovieListModel() {
		items = FXCollections.observableArrayList();
		items.add(new Movie("Ant Man", "/images/AntMan.jpg"));
		items.add(new Movie("Iron Man", "/images/IronMan.jpg"));
		items.add(new Movie("Doctor Strange", "/images/DoctorStrange.jpg"));
		items.add(new Movie("Guardians of The Galaxy", "/images/GuardiansOfTheGalaxy.jpg"));
		items.add(new Movie("Thor", "/images/Thor.jpg"));
		items.add(new Movie("Black Panther", "/images/BlackPanther.jpg"));
	}
	
	public void addMovie(Movie movie) {
		items.add(movie);
	}
	
	public ObservableList<Movie> getMovieList() {
		return items;
	}

}
