package choice;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainEcom {
	
	public void productManagementClick() throws IOException {
		
		Stage stage = new Stage();
		stage.setTitle("Product Management");
		
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/product/mainProduct.fxml"));
		
		Scene scene = new Scene(actorGroup);
		stage.setScene(scene);
		
		stage.show();
		
	}
	
	public void userManagementClick() throws IOException {
		
		Stage stage = new Stage();
		stage.setTitle("Product Management");
		
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/user/mainUser.fxml"));
		
		Scene scene = new Scene(actorGroup);
		stage.setScene(scene);
		
		stage.show();
	}
}
