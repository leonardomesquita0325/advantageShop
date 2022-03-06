#encoding: utf-8
Feature: Adicionar produto no carrinho apos login

Background:
		Given que esteja na pagina inicial Advantage Shopping    
    And clico em user
    And insiro userName 
    And insiro password 
    And clico em logar		   
Scenario: Adiciona produtos ao carrinho
    And seleciono a categoria de produtos speakers
    And seleciono o primeiro speaker
    And adiciono speaker ao carrinho
    And clico no icone de cart
    Then confirmo o speaker selecionado
Scenario: Remover produto adicionado ao carrinho
    And clico no icone de cart
    And clico em remove item
    Then confirmo o mensagem de cart empity