package com.company;

abstract class Conta {

    int numero;
    int agencia;
    Cliente cliente;
    double saldo;
    static int i = 0;
    static int j = 0;


    public Conta(Cliente cliente) {
        numero = ++i;
        agencia = ++j;
        this.cliente = cliente;
        saldo = 0.0;

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

   abstract void sacar(double valor);


    public void depositar(double valor) {
        if (valor >= 0) {
            saldo = saldo + valor;
        }
    }

    public void imprimirDados() {
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Nome: " + cliente.nome);
        System.out.println("CPF: " + cliente.cpf);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("==============\n==============\n");
    }
}