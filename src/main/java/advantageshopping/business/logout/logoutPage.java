package advantageshopping.business.logout;

import org.openqa.selenium.By;

public class logoutPage {
	private By userCadastrado = By.id("menuUserLink");
	private By btnUser = By.cssSelector("label[ng-click *= 'signOut($event)']");
	private By btnFacebook = By.cssSelector("span[data-ng-click *= 'singWithFacebook()']");
	
	public By getBtnUs () {
		return btnUser;
	}

	public By getUserCadastrado () {
		return userCadastrado;
	}
	public By getbtnFacebook () {
		return btnFacebook;
	}
}

