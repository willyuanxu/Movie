package model;

import javafx.scene.image.Image;

public class Movie {
	private String name;
	private Image image; 
	private int rating;
	private String description;
	
	public Movie(String name, String filepath, String description) {
		this.name = name;
		this.image = new Image(filepath);
		this.description = description;
		this.rating = 0;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Image getImage() {
		return image;
	}



	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String des) {
		this.description = des;
	}


	

}
