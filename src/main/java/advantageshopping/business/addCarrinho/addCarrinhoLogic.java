package advantageshopping.business.addCarrinho;

import java.io.IOException;

import advantageshopping.utils.baseMethod;


public class addCarrinhoLogic extends baseMethod{
	addCarrinhoPage addPageCar = new addCarrinhoPage();
	
	public void selectSpeaker () throws IOException {
		waitElementIsClickable(addPageCar.getSpeaker());
	    Click(addPageCar.getSpeaker());
	    wait(500);
		evidencias("target/carrinhoUser/selectSpeaker.png");
	}
	
	public void selectSpeakerPr () throws IOException {
		waitElementIsClickable(addPageCar.getSpeakerPr());
		Click(addPageCar.getSpeakerPr());
		wait(500);
		evidencias("target/carrinhoUser/clickSpeaker.png");
	}
	
	public void addProductToCart () throws IOException {
		waitElementIsClickable(addPageCar.getAddToCart());
		Click(addPageCar.getAddToCart());
		wait(500);
		evidencias("target/carrinhoUser/addProductCart.png");
	}
		public void enterCartPrd() throws IOException {
		waitElementIsClickable(addPageCar.getEnterCart());
		Click(addPageCar.getEnterCart());
		wait(500);
		evidencias("target/carrinhoUser/enterCardPrd.png");
	
	}
	public void confirmPrd() throws IOException {
	    waitElement(addPageCar.getConfirmPrd());
	    wait(500);
		evidencias("target/carrinhoUser/confirmPrd.png");
	}
	public void removePrd() throws IOException {
		waitElementIsClickable(addPageCar.getRemove());
		Click(addPageCar.getRemove());
		wait(500);
		evidencias("target/carrinhoUser/removePrd.png");
	}
	public void confirmCartVazio() throws IOException {
		waitElement(addPageCar.getConfirmRemove());
		wait(500);
		evidencias("target/carrinhoUser/confirmCartVazio.png");
	}
}
