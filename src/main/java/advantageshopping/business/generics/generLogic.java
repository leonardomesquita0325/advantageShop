package advantageshopping.business.generics;


import java.io.IOException;

import advantageshopping.utils.baseMethod;

public class generLogic extends baseMethod {

	generPage generPage = new generPage();
	
	public void toBrowse(){
		browseTheWeb("http://advantageonlineshopping.com/#/");
	}
	
	public void clickUser () throws IOException {
		waitElementIsClickable(generPage.getBtnUser());
		click(generPage.getBtnUser());
		wait(500);
		evidencias("target/generics/clickUser.png");
	}
	
	public void validateCategorySpeaker () throws Exception {
		waitElementIsClickable(generPage.getSpakers());
		wait(500);
		evidencias("target/generics/validoMensagem.png");

	}
}
