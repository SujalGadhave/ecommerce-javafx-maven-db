package user_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import database.SqlData;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class AddUserController extends SqlData {
	
	@FXML
	TextField userId;
	
	@FXML
	TextField userName;
	
	@FXML
	TextField emailId;
	
	@FXML
	TextField password;
	
	@FXML
	Label errorMessage;
	
	public void addUserClick() throws SQLException {
		
		Connection connection = DriverManager.getConnection(url,username,sqlpass);
		
		Statement statement = connection.createStatement();
		
		String query = "INSERT INTO ecomlogin.user (userid,username,emailid,password)" + 
				"VALUES('" + userId.getText() + "','" + userName.getText() + "','" + emailId.getText()+ "','"+ password.getText() +"');";
		
		statement.execute(query);
		
		if((userId.getText() != null && userName.getText() != null) && (emailId.getText() != null && password.getText() != null)) {
			
			errorMessage.setTextFill(Color.GREEN);
			errorMessage.setText("Product added successfully...");
			
		}else {
			
			errorMessage.setTextFill(Color.RED);
			errorMessage.setText("Something went wrong...");
			
		}
	}
}
