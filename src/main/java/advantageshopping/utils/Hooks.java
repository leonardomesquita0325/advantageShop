package advantageshopping.utils;


import java.io.IOException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends baseMethod{
	
	@Before
	public void beforeScenario(Scenario scenario) {
		System.out.println("Iniciando a execução do Teste: " + scenario.getName());

	}

	@After
	public void afterScenario(Scenario scenario) throws IOException {
		System.out.println("Finalizando a execução do Teste: " + scenario.getName());
		navegacao.quitDriver();
	}		
	}

