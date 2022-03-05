package advantageshopping.business.cadUser;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class cadUserStep {

	cadUserLogic cdLogi = new cadUserLogic();
	
	
	@And("clico em creat new account")
	public void clickCreateAccount() throws IOException {
		cdLogi.createAccount();
	}
	@And("^insiro userNameCad$")
	public void userName() throws IOException {
       cdLogi.userName();
	}
	@And("^insiro email$")
	public void enterEmail() throws IOException {
       cdLogi.Email();
	}
	@And("^insiro passwordCad$")
	public void password() throws IOException {
       cdLogi.passwordCad();
	}
	@And("^insiro confirmPassWord$")
	public void confirmPassword() throws IOException{
		cdLogi.confirmPassword();
	}
	@And("^insiro firstName$")
	public void firstName() throws IOException {
		cdLogi.firstName();
	}

	@And("^insiro lastName$")
	public void lastName() throws IOException {
		cdLogi.lastName();
	}

	@And("^insiro phone$")
	public void phone() throws IOException {
		cdLogi.phone();
	}

	@And("^seleciono country$")
	public void country() throws IOException {
		cdLogi.selectCountry();
	}

	@And("^insiro city$")
	public void city() throws IOException {
		cdLogi.city();
	}

	@And("^insiro adress$")
	public void adress() throws IOException {
		cdLogi.adress();
	}

	@And("^insiro state$")
	public void state() throws IOException {
		cdLogi.state();
	}

	@And("^insiro postalCode$")
	public void postalCode() throws IOException {
		cdLogi.postalCode();
	}

	@And("^seleciono I agree$")
	public void acceptConditions() throws IOException {
		cdLogi.acceptConditions();
	}

	@And("^clico em register$")
	public void register() throws IOException {
		cdLogi.register();
	}
	@And("^clico em already have an account$")
	public void clicoAlreadyAcount() throws IOException {
		cdLogi.alreadyAccount();
	}

}
