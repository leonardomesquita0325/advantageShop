#encoding: utf-8
Feature: Realizar cadastro com sucesso

Background:
		Given que esteja na pagina inicial Advantage Shopping    
    And clico em user		
  Scenario: Cadastrar usuario com sucesso
    And clico em creat new account
    And insiro userNameCad 
    And insiro email
    And insiro passwordCad
    And insiro confirmPassWord
    And insiro firstName
    And insiro lastName
    And insiro phone
    And seleciono country
    And insiro city
    And insiro adress
    And insiro state
    And insiro postalCode
    And seleciono I agree
    And clico em register
    Then valido category Speaker
    
Scenario: Abrir form de creat new account porem clico em already have an account e entro com login e senha
    And clico em creat new account
    And clico em already have an account
    And insiro userName 
    And insiro password 
    And clico em logar
    Then valido category Speaker