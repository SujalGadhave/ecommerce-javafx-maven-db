package product_management;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProductMain {
	
	public void addProduct() throws IOException {
		
		Stage stage = new Stage();
		stage.setTitle("Add product");
		
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/product/addProduct.fxml"));
		
		Scene scene = new Scene(actorGroup);
		stage.setScene(scene);
		
		stage.show();
	}
	
	public void searchProduct() throws IOException {
		
		Stage stage = new Stage();
		stage.setTitle("Add product");
		
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/product/searchProduct.fxml"));
		
		Scene scene = new Scene(actorGroup);
		stage.setScene(scene);
		
		stage.show();
		
	}
	
	public void removeProduct() throws IOException {
		
		Stage stage = new Stage();
		stage.setTitle("Add product");
		
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/product/removeProduct.fxml"));
		
		Scene scene = new Scene(actorGroup);
		stage.setScene(scene);
		
		stage.show();
	}
	
}
