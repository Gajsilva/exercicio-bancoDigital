package dominio;

import java.util.Random;

public class Conta {
    Random aleatorio = new Random();

    private String agencia = "0414" ;
    private int conta = aleatorio.nextInt(99);
    private final float saldoInicial = 1000;
    private float saldo = saldoInicial;

    public Usuario usuario ;

    public Conta(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getSaldo() {
        return saldo;
    }

}

