package advantageshopping.business.logUser;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class logUserStep {

	logUserLogic logLogic = new logUserLogic();
	
	@Given("^que esteja na pagina inicial Advantage Shopping$")
	public void navigateWebSiteHomePage () {
		logLogic.openBrowser();
	}
	
	@And("^clico em user$")
	public void selectUser () throws IOException {
		logLogic.clickUser();
	}
	
	@And("insiro userName$")
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
	@Then("^valido category Speaker$")
	public void validateFinalMessage () throws Exception {
		logLogic.validateCategorySpeaker();
	}
} 
