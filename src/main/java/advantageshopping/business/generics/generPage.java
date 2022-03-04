package advantageshopping.business.generics;

import org.openqa.selenium.By;

public class generPage {

	private By spakers = By.id("speakersTxt");
	private By btnUser = By.xpath("//*[@id=\"menuUser\"]");

	public By getBtnUser () {
		return btnUser;
	}

	public By getSpakers () {
		return spakers;
	}
}
