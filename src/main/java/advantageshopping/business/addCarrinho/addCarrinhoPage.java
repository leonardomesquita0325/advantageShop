package advantageshopping.business.addCarrinho;

import org.openqa.selenium.By;

public class addCarrinhoPage {
	private By Speaker = By.id("speakersImg");
	private By SpeakerPr = By.id("20");
	private By addToCart = By.xpath("//button[@name='save_to_cart']");
	private By selectUser = By.xpath("//span[@class='hi-user containMiniTitle ng-binding']");
	private By enterCart = By.id("menuCart");
	private By confirmPrd = By.xpath("//label[contains(text(),'BOSE SOUNDLINK BLUETOOTH SPEAKER III')]");
	private By removePrd = By.cssSelector("a[data-ng-click *= 'removeProduct($index)']");
	private By confirmRemo = By.xpath("//label[contains(text(),'Your shopping cart is empty')]");
	
	public By getSpeaker() {
		return Speaker; 
	}
	
	public By getSpeakerPr () {
		return SpeakerPr;
	}
	
	public By getAddToCart () {
		return addToCart;
	}
	
	public By getSelectUser () {
		return selectUser;
	}
	public By getEnterCart() {
		return enterCart;
	}
	public By getConfirmPrd() {
		return confirmPrd;
	}
	public By getRemove() {
		return removePrd;
	}
	public By getConfirmRemove() {
		return confirmRemo;
	}
}
