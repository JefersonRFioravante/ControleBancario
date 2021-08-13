package com.company;

public class Main {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(new Cliente("Jeferson", "01425895463"));
        contaCorrente.imprimirDados();

        ContaPoupanca contaPoupanca = new ContaPoupanca(new Cliente("Fioravante", "98765432152"));
        contaPoupanca.imprimirDados();

    }
}