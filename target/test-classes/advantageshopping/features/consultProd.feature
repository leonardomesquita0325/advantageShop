#encoding: utf-8
Feature: Pesquisa produtos

Background:
		Given que esteja na pagina inicial Advantage Shopping 
		And clico em search
Scenario: Consultar Produto
    And inputo produto a consultar
    Then confirmo speaker pesquisado		   
Scenario: Cancelo consulta
		And encerro search
		Then confirmo cancelamento de pesquisa