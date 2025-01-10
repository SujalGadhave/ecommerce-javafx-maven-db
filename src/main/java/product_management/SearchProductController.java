package product_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.SqlData;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class SearchProductController extends SqlData {

	@FXML
	TextField searchProduct;
	
	@FXML
	Label errorMessage;
	
	public void searchProductClick() throws SQLException {
		
		Connection connection = DriverManager.getConnection(url,username,sqlpass);
		
		Statement statement = connection.createStatement();
		
		String query = "SELECT * From ecomlogin.product where productname = '" + searchProduct.getText() + "';";
		
		ResultSet result = statement.executeQuery(query);
		
		if(result.next()) {
			errorMessage.setTextFill(Color.GREEN);
			errorMessage.setText(searchProduct.getText());
		}else {
			errorMessage.setTextFill(Color.RED);
			errorMessage.setText("Product not found...");
		}
		
	}
	
}
