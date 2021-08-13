package com.company;

public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - (valor + 0.10);
        } else {
            System.out.println("Não há saldo!\n");
        }
    }

}