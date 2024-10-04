package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}


	@Override
	public void start(Stage stage) {
		try {
			Parent root=FXMLLoader.load(getClass().getResource("src/application/Scene1.fxml"));
			Scene scene=new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			//stage.setFullScreen(false);
			//stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("e"));
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}	
	