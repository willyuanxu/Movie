package controller;

import java.util.Arrays;
import java.util.List;

import application.MovieCell;
import application.Yuanx_yeqing_MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Movie;
import model.MovieListModel;

public class MovieController {
	private Yuanx_yeqing_MainApp main;
	private static Image filledStar;
	private static Image unfilledStar; 
	private List<ImageView> stars;
	private MovieListModel model;
	
	public void setMain(Yuanx_yeqing_MainApp main) {
		this.main = main;
	}
	
	public void initialize() {
		this.model = new MovieListModel();
		// images used for the stars
		if (filledStar == null && unfilledStar == null) {
			filledStar = new Image("/view/filledStar.png");
			unfilledStar = new Image("/view/unfilledStar.png");
		}
		
		// put all stars into a list for easy tracking 
		stars = Arrays.asList(starOne, starTwo, starThree, starFour, starFive);
		this.setStars(0);
		
		this.setUpListView();
		this.setUpStarButtonsLogic();
	}
	
	private void setUpListView() {
		// add all the movies 
		movieList.getItems().addAll(model.getMovieList());
		
		movieList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		movieList.getSelectionModel().selectFirst();
		
		// set up cell factory
		movieList.setCellFactory(l -> new MovieCell());
		
		// add listener 
		movieList.getSelectionModel().selectedItemProperty().addListener((obVal, oldVal, newVal) -> {
			this.setUpMainDisplay(newVal);
		});
		// set default display
		this.setUpMainDisplay(movieList.getSelectionModel().getSelectedItem());
	}
	
	private void setUpMainDisplay(Movie m) {
		this.movieLabel.setText(m.getName());
		this.movieImage.setImage(m.getImage());
	}
	
	private void setUpStarButtonsLogic() {
		for (ImageView star : stars) {
			star.setOnMouseClicked(value -> {
				int index = stars.indexOf(star);
				this.setStars(index+1);
				this.movieList.getSelectionModel().getSelectedItem().setRating(index+1);
			});
		}
	}
	
	private void setStars(int num) {
		for (int i = 0; i < num; i++) {
			stars.get(i).setImage(filledStar);
		}
		for (int i = num; i < stars.size(); i++) {
			stars.get(i).setImage(unfilledStar);
		}
	}
	
	
	@FXML 
	private ListView<Movie> movieList;
	
	@FXML
	private Label movieLabel;
	
	@FXML 
	private ImageView movieImage; 
	
	@FXML
	private ImageView starOne;
	
	@FXML
	private ImageView starTwo;
	
	@FXML
	private ImageView starThree;
	
	@FXML
	private ImageView starFour;
	
	@FXML
	private ImageView starFive;
	

}
