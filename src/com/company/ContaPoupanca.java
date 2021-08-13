package com.company;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    void sacar() {}

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
        } else {
            System.out.println("Não há saldo!\n");
        }
    }
}
