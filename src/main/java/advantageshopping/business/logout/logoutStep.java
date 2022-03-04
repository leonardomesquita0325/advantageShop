package advantageshopping.business.logout;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class logoutStep {
logoutLogic lgLogic = new logoutLogic();
	

	@And("^clico em userCadastrado$")
	public void clickUserCadLogout () {
		lgLogic.clickUserCad();
	}
	@And("^clico em logout$")
	public void logoutSist () {
		lgLogic.logout();
	}
	@Then("^confirmo botao Sign In With Facebook na tela de Login$")
	public void confirmLogout() {
		lgLogic.confirLogout();
	}
} 

