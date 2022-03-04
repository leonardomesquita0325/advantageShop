package advantageshopping.business.consultarPr;

import java.io.IOException;

import advantageshopping.utils.baseMethod;
 
      
public class consultPrLogic extends baseMethod {
	consultPrPage conPg = new consultPrPage(); 

	public void consultPr() throws IOException {
		waitElementIsClickable(conPg.getSearch());
		click(conPg.getSearch());
		wait(500);
		evidencias("target/cadUser/getSearch.png");
	}
	public void inputSearch() throws IOException{
	   waitElementIsClickable(conPg.getInputSearch());
	   click(conPg.getInputSearch());
	   inputText("BOSE SOUNDLINK BLUETOOTH SPEAKER III",conPg.getInputSearch());
	   wait(500);
	   evidencias("target/consultProd/valorSearch.png");	
	}
	public void confirPrd() throws IOException{
		waitElement(conPg.getProdSearch());
		wait(500);
		evidencias("target/consultProd/produtSearch.png");
	}
	public void closeSearch() throws IOException {
		waitElementIsClickable(conPg.getCloseSearch());
		click(conPg.getCloseSearch());
		wait(500);
		evidencias("target/consultProd/closeSearch.png");
	}
	public void confirCanceled() throws IOException{
		waitElement(conPg.getConfirmCanceled());
		wait(500);
		evidencias("target/consultProd/confirCanceled.png");
	}
}
