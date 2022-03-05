package advantageshopping.business.logUser;

import org.openqa.selenium.By;

public class logUserPage {

	private By cmpUserName = By.xpath("//input[@name='username']");
	private By cmpSenha = By.xpath("//input[@name='password']");
	private By btnLogar = By.xpath("(//*[contains(text(),'SIGN IN')])[2]");
	private By spakers = By.id("speakersTxt");
	private By btnUser = By.xpath("//*[@id=\"menuUser\"]");

	public By getCmpUserName() {
		return cmpUserName;
	}

	public By getCmpSenha() {
		return cmpSenha;
	}
	
	public By getBtnLogar() {
		return btnLogar;
	}
	public By getBtnUser () {
		return btnUser;
	}

	public By getSpakers () {
		return spakers;
	}
	
	}
