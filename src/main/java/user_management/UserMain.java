package user_management;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UserMain {
	public void addUser() throws IOException {
		
		Stage stage = new Stage();
		stage.setTitle("Add product");
		
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/user/addUser.fxml"));
		
		Scene scene = new Scene(actorGroup);
		stage.setScene(scene);
		
		stage.show();
	}
	
	public void searchUser() throws IOException {
		
		Stage stage = new Stage();
		stage.setTitle("Search User");
		
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/user/searchUser.fxml"));
		
		Scene scene = new Scene(actorGroup);
		stage.setScene(scene);
		
		stage.show();
		
	}
	
	public void removeUser() throws IOException {
		
		Stage stage = new Stage();
		stage.setTitle("Remove User");
		
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/user/removeUser.fxml"));
		
		Scene scene = new Scene(actorGroup);
		stage.setScene(scene);
		
		stage.show();
	}
}
