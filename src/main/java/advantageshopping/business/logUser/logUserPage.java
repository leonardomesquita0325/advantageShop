package advantageshopping.business.logUser;

import org.openqa.selenium.By;

public class logUserPage {

	private By cmpUserName = By.xpath("//input[@name='username']");
	private By cmpSenha = By.xpath("//input[@name='password']");
	private By btnLogar = By.xpath("(//*[contains(text(),'SIGN IN')])[2]");
    //private By signOut = By.xpath("//label[@translate='Sign_out'][1]");

	public By getCmpUserName() {
		return cmpUserName;
	}

	public By getCmpSenha() {
		return cmpSenha;
	}
	
	public By getBtnLogar() {
		return btnLogar;
	}
	
	}
