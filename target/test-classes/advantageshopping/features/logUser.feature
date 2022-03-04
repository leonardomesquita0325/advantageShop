#encoding: utf-8
Feature: Realizo login no site Advantage Shopping
 

  Scenario: Realizar login com sucesso no site
    Given que esteja na pagina inicial Advantage Shopping
  	And clico em user
    And insiro userName 
    And insiro password 
    And clico em logar
    Then valido category Speaker
 