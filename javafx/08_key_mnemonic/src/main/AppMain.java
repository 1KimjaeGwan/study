package main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader 
				= new FXMLLoader(
					getClass().getResource("Root.fxml")
				);
			Parent root = loader.load();
			
			MainController controller 
				= loader.getController();
			
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			
			controller.setStage(primaryStage);
			primaryStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}





