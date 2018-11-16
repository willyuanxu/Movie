package controller;

import java.util.Arrays;
import java.util.List;

import application.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MovieController {
	private MainApp main;
	private static Image filledStar;
	private static Image unfilledStar; 
	private List<ImageView> stars;
	
	public void setMain(MainApp main) {
		this.main = main;
	}
	
	public void initialize() {
		
		// images used for the stars
		if (filledStar == null && unfilledStar == null) {
			filledStar = new Image("/view/filledStar.png");
			unfilledStar = new Image("/view/unfilledStar.png");
		}
		
		// put all stars into a list for easy tracking 
		stars = Arrays.asList(starOne, starTwo, starThree, starFour, starFive);
		this.setStars(0);
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
	private ListView movieList;
	
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
