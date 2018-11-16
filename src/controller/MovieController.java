package controller;

import application.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;

public class MovieController {
	MainApp main; 
	public void setMain(MainApp main) {
		this.main = main;
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
