
package arrays;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Conta;

public class TestaArrays {
    public static void main(String[] args){
        Conta[] contas = new Conta[10];

        // Criar contas com saldos distintos
        for (int i = 0; i < contas.length; i++) {
            Conta conta = new ContaCorrente();
            conta.deposita(i * 100.0);
            contas[i] = conta; // guarda no array
        }

        // Calcular média
        double soma = 0;
        for (Conta c : contas) {
            soma += c.getSaldo();
        }
        double media = soma / contas.length;

        System.out.println("Média dos saldos: " + media);
    }
}
