@saudeDemo
Feature: Teste Automacao

  Aula sobre Selenium WebDriver.

#  Background:
#    Given realizar o login no site sauce demo
#    And estou na tela inicial
#


  Scenario: Validar titulo do pedido na tela de ckeckout
    Given realizar o login no site sauce demo
    And estou na tela inicial
    When seleciono a blusa noir jacket
    And escolho o tamanho "L"
    And escolho a cor "Red"
    And clico no botão adicionar ao carrinho
    And clico no botão do menu checkout
    Then verifico se o titulo do pedido esta correto
    
