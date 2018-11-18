package model;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MovieListModel {
	private ObservableList<Movie> items;
	
	public MovieListModel() {
		items = FXCollections.observableArrayList();
		items.add(new Movie("Ant Man", "/images/AntMan.jpg", "A movie for superhero ant man."));
		items.add(new Movie("Iron Man", "/images/IronMan.jpg", "A movie telling the story of superhero iron man."));
		items.add(new Movie("Doctor Strange", "/images/DoctorStrange.jpg","A movie telling the story why Doctor Strange is strange."));
		items.add(new Movie("Guardians of The Galaxy", "/images/GuardiansOfTheGalaxy.jpg", "A movie about a group of people who protected the galaxy."));
		items.add(new Movie("Thor", "/images/Thor.jpg", "A movie about a man with super power, Thor."));
		items.add(new Movie("Black Panther", "/images/BlackPanther.jpg", "A story about a female superhero and her msytery."));
	}
	
	public void addMovie(Movie movie) {
		items.add(movie);
	}
	
	public ObservableList<Movie> getMovieList() {
		return items;
	}

}
