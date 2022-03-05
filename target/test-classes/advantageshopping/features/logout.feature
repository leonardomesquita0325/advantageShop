#encoding: utf-8
Feature: Realizo logout no site Advantage Shopping


Background:
		Given que esteja na pagina inicial Advantage Shopping    
    And clico em user		
  Scenario: Realizar logout com sucesso no site
    And insiro userName 
    And insiro password 
    And clico em logar
    And clico em userCadastrado
    And clico em logout
    And clico em user
    Then confirmo botao Sign In With Facebook na tela de Login
