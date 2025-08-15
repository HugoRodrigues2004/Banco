package br.com.caelum.contas.modelo;

public class Banco {
    private String nome;
    private int numero;
    private Conta[] contas;
    private int quantidadeContas; // controla quantas contas foram adicionadas

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.contas = new Conta[10];
        this.quantidadeContas = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void adiciona(Conta c) {
        if (quantidadeContas < contas.length) {
            contas[quantidadeContas] = c;
            quantidadeContas++;
        } else {
            System.out.println("Banco cheio! Não é possível adicionar mais contas.");
        }
    }

    public void mostraContas() {
        for (int i = 0; i < contas.length; i++) {
            if (contas[i] != null) {
                System.out.println("Posição " + i + ": " + contas[i]);
            }
        }
    }

    public boolean contem(Conta conta) {
        for (Conta c : contas) {
            if (c != null && c.equals(conta)) {
                return true;
            }
        }
        return false;
    }
}
