package advantageshopping.business.consultarPr;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class consultPrStep {
	
	consultPrLogic coPrLo = new consultPrLogic();
	
	@And("^clico em search$")
	public void clicoEmSearch() throws IOException {
       coPrLo.consultPr();
	}
	@And("^inputo produto a consultar$")
	public void inputSearch() throws IOException {
       coPrLo.inputSearch();
	}
	@And("^encerro search$")
	public void closeSearch() throws IOException {
       coPrLo.closeSearch();
	}
	@Then ("^confirCanceled$")
	public void confirmCancel() throws IOException{
		coPrLo.confirCanceled();
	}
	@Then("^confirmo speaker pesquisado$")
	public void confirmPrdt() throws IOException{
		coPrLo.confirPrd();
	}
}
