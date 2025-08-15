
package br.com.caelum.contas.modelo;

import br.com.caelum.contas.modelo.Conta;

public abstract class Conta {
    private String titular;
    private int numero;
    private int agencia;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
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

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor) {
        saldo += valor;
    }

    public boolean saca(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Titular: %s | Conta: %d | Agência: %d | Saldo: R$ %.2f",
            getTitular(), getNumero(), getAgencia(), getSaldo());
    }
    
}
