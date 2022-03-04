package advantageshopping.business.generics;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class generStep {
	
	generLogic grnLog = new generLogic();
	
	@Given("^que esteja na pagina inicial Advantage Shopping$")
	public void navigateWebSiteHomePage () {
		grnLog.toBrowse();
	}
	
	@And("^clico em user$")
	public void selectUser () throws IOException {
		grnLog.clickUser();
	}
	
	@Then("^valido category Speaker$")
	public void validateFinalMessage () throws Exception {
		grnLog.validateCategorySpeaker();
	}
}
