# Descrição dos Arquivos Java - Projeto POO

Este documento apresenta uma breve descrição dos quatro arquivos Java localizados no repositório [github.com/wagnerelvio/poo-2020501](https://github.com/wagnerelvio/poo-2020501/tree/main/abstrata) que demonstram conceitos de Programação Orientada a Objetos (POO), como herança, classes abstratas e polimorfismo.

## 1. BancoApp.java

- Classe principal do projeto que contém o método `main`.
- Responsável por instanciar objetos das classes `ContaCorrente` e `ContaPoupanca`.
- Demonstra o uso de herança e polimorfismo ao manipular as contas por meio de referências da superclasse `ContaBancaria`.

## 2. ContaBancaria.java

- Classe abstrata que serve como modelo base para os diferentes tipos de conta.
- Define atributos comuns como número da conta e saldo.
- Contém métodos como `depositar`, `sacar` e `transferir`.
- Declara o método abstrato `validaConta()` que deve ser implementado pelas subclasses.

## 3. ContaCorrente.java

- Subclasse de `ContaBancaria` que representa uma conta corrente.
- Implementa o método `validaConta()` com regras específicas para esse tipo de conta.
- Pode incluir atributos adicionais, como limite de crédito.

## 4. ContaPoupanca.java

- Também herda de `ContaBancaria`, representando uma conta poupança.
- Fornece sua própria implementação de `validaConta()` com validações específicas.
- Pode incluir atributos e métodos como taxa de juros e rendimento da poupança.

