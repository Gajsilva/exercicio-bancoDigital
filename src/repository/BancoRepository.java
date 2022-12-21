package repository;

import dominio.Conta;

public class BancoRepository {
    public void imprime(){
        System.out.println("Bem vindo "+this.usuario.getNome());
        System.out.println("Agencia é: "+agencia);
        System.out.println("Conta é: "+conta);
        System.out.println("Saldo inicial: "+this.saldo);
        System.out.println("------------------------------------");
    }

    public void pagar(double valor){
        saldo -= valor;
    }
    public boolean depositar(double valor){
        saldo += valor;
        return false;
    }

    public void transferir(double valor, Conta contaDestino ){
        this.pagar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirExtrato(){
        System.out.println("Seu extrato "+this.usuario.getNome());
        System.out.printf("Saldo: %.2f%n",this.saldo);
        System.out.println("----------------------");
    }
}
