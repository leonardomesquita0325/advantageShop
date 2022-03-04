package advantageshopping.business.consultarPr;

import org.openqa.selenium.By;

public class consultPrPage {
	
	private By search = By.id("menuSearch");
	private By inputSearch = By.cssSelector("#autoComplete");
	private By prodSearch = By.xpath("//p[contains(text(),'BOSE SOUNDLINK BLUETOOTH SPEAKER III')]");
	private By closeSearch = By.cssSelector("div[data-ng-click *= 'closeSearchForce()']");
	private By confirmCanceled = By.xpath("//a[contains(text(),'SPECIAL OFFER')]");
	
	public By getSearch() {
		return search;
	}
	public By getInputSearch() {
		return inputSearch;
	}
	public By getProdSearch() {
		return prodSearch;
	}
	public By getCloseSearch() {
		return closeSearch;
	}
	public By getConfirmCanceled() {
		return confirmCanceled;
	}


}
