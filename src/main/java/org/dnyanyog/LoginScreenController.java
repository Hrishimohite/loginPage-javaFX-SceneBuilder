package org.dnyanyog;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class LoginScreenController {
	@FXML
	TextField loginName;
	
	@FXML
	TextField password;
	
	@FXML
	Label errorMessage;
	
	public void loginButtonClick() {
		System.out.println(loginName.getText());
		System.out.println(password.getText());
	}

}
