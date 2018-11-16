package application;

import controller.MovieController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Yuanx_yeqing_MainApp extends Application {
	
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/movieView.fxml"));
			Parent root = (Parent)loader.load();
			MovieController control = loader.getController();
			control.setMain(this);
			Scene scene = new Scene(root, 700, 500);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	

	
	
	//set up components, add accessibility text
	private void setUpCenterPane() {
		
	}
	
	private void setUpListView() {
		
	}



	
	

}
