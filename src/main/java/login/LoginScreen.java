package login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginScreen extends Application {
	public static void main(String[] args) {
		Application.launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
			
		Stage stage = new Stage();
		stage.setTitle("Customer Login");
		
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/login/loginPage.fxml"));
		
		Scene scene = new Scene(actorGroup);
		stage.setScene(scene);
		
		stage.show();
	}
}