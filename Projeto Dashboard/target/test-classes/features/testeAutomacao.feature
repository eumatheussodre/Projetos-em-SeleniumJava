@saudeDemo
Feature: Teste Automacao

  Aula sobre Selenium WebDriver.

#  Background:
#    Given realizar o login no site sauce demo
#    And estou na tela inicial
#


  Scenario: Mexendo no Dashboard
    Given acessando o Dashboard e logando
    And acessando modulo de Contas
    And acessando modulo de Despesas
    And acessando modulo de Meta
    And acessando modulo de Transacoes
    Then saindo da conta

    
