package advantageshopping.business.logUser;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class logUserStep {

	logUserLogic logLogic = new logUserLogic();
	
	
	@Given("insiro userName$")
	public void enterUser () throws IOException {
		logLogic.User();
	}
	
	@And("insiro password$")
	public void enterPassword () throws IOException {
		logLogic.Password();
	}
	
	@And("^clico em logar$")
	public void clickToLogin () throws IOException{
		logLogic.clickLogin();
	}
	
} 
