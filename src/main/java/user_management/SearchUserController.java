package user_management;

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

public class SearchUserController extends SqlData {
	@FXML
	TextField searchUser;
	
	@FXML
	Label errorMessage;
	
	public void searchUserClick() throws SQLException {
		
		Connection connection = DriverManager.getConnection(url,username,sqlpass);
		
		Statement statement = connection.createStatement();
		
		String query = "SELECT * From ecomlogin.user where productname = '" + searchUser.getText() + "';";
		
		ResultSet result = statement.executeQuery(query);
		
		if(result.next()) {
			errorMessage.setTextFill(Color.GREEN);
			errorMessage.setText(searchUser.getText());
		}else {
			errorMessage.setTextFill(Color.RED);
			errorMessage.setText("User not found...");
		}
		
	}
}
