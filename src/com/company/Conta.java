package com.company;

abstract class Conta {

    int numero;
    int agencia;
    Cliente cliente;
    double saldo;


    public Conta(int numero, int agencia, Cliente cliente) {
          saldo = 0;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    abstract void sacar();


    public void depositar(){

    }
}
