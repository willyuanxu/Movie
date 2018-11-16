package application;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import model.Movie;

public class MovieCell extends ListCell<Movie>{
	private HBox row;
	private Label name; 
	private ImageView icon; 
	
	public MovieCell() {
		row = new HBox();
		row.setSpacing(10);
		icon = new ImageView();
		name = new Label();
		row.getChildren().addAll(icon, name);
		row.setAlignment(Pos.CENTER_LEFT);
	}
	
	@Override
	public void updateItem(Movie m, boolean empty) {
		super.updateItem(m, empty);
		if(empty) {
			this.setText(null);
			this.setGraphic(null);
		} else {
			makeRow(m);
			setGraphic(row);
		}
	}
	
	private void makeRow(Movie m) {
		name.setText(m.getName());
		icon.setImage(m.getImage());
		icon.setFitWidth(30);
		icon.setPreserveRatio(true);
		
		
	}
}
