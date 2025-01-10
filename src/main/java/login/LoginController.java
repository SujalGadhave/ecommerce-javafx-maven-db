package login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import database.SqlData;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController extends SqlData{
	
	@FXML
	private TextField userName;
	
	@FXML
	private PasswordField password;
	
	@FXML
	Label errorMessage;
	
	
	public void loginButtonClick() throws SQLException, IOException {
		
		Connection connection = DriverManager.getConnection(url, username, sqlpass);
		Statement statement = connection.createStatement();
		
		String query = "SELECT * From ecomlogin.login where username = '" + userName.getText() + "'and password = '"
				+ password.getText() + "';";
		
		ResultSet result = statement.executeQuery(query);
		
		if(result.next()) {
			errorMessage.setTextFill(Color.GREEN);
			errorMessage.setText("login successfully...");
		}else {
			errorMessage.setTextFill(Color.RED);
			errorMessage.setText("login failed...");
		}
		
		
		Stage stage = new Stage();
		stage.setTitle("Choice");
		
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/choice/mainPage.fxml"));
		
		Scene scene = new Scene(actorGroup);
		stage.setScene(scene);
		
		stage.show();
	}
}
