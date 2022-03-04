package advantageshopping.business.addCarrinho;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class addCarrinhoStep {
	   
	   addCarrinhoLogic addCarLogi = new addCarrinhoLogic();
		
		@And("^seleciono a categoria de produtos speakers$")
		public void selectTabletsCategory () throws IOException {
			addCarLogi.selectSpeaker();
		}
		
		@And("^seleciono o primeiro speaker$")
		public void selectFirstTablet () throws IOException {
			addCarLogi.selectSpeakerPr();
		}
		
		@And("^adiciono speaker ao carrinho$")
		public void addTabletToCart () throws IOException {
			addCarLogi.addProductToCart();
		}
		@And("^clico no icone de cart$")
		public void clickIconeCart() throws IOException {
			addCarLogi.enterCartPrd();
		}
		@And("^clico em remove item$")
		public void clickRemovePrd() throws IOException {
			addCarLogi.removePrd();
		}
		@Then("^confirmo o speaker selecionado$")
		public void confirmProd() throws IOException {
			addCarLogi.confirmPrd();
		}
		@Then("^confirmo o mensagem de cart empity$")
		public void confirmCartEmpity() throws IOException {
			addCarLogi.confirmCartVazio();
		}
		
		

}
