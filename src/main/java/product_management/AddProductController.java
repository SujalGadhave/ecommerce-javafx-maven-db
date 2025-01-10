package product_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import database.SqlData;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddProductController extends SqlData {
	
	@FXML
	TextField productId;
	
	@FXML
	TextField productName;
	
	@FXML
	TextField productQuantity;
	
	@FXML
	TextField productPrice;
	
	@FXML
	Label errorMessage;
	
	public void addProductClick() throws SQLException {
		
		Connection connection = DriverManager.getConnection(url,username,sqlpass);
		
		Statement statement = connection.createStatement();
		
		String query = "INSERT INTO ecomlogin.product (productid,productname,productprice,productquantity)" + 
				"VALUES('" + productId.getText() + "','" + productName.getText() + "','" +productPrice.getText()+ "','"+ productQuantity.getText() +"');";
		
		statement.execute(query);
		
		if((productId.getText() != null && productName.getText() != null) && (productPrice.getText() != null && productQuantity.getText() != null)) {
			
			errorMessage.setText("Product added successfuly...");
			
		}else {
			
			errorMessage.setText("Something went wrong...");
			
		}
	}
}
