package br.com.zup;

public class Fatura {
    private Consumidor consumidor;
    private double valorDaFatura;
    private String dataDeVencimento;

    public Fatura(Consumidor consumidor, double valorDaFatura, String dataDeVencimento) {
        this.consumidor = consumidor;
        this.valorDaFatura = valorDaFatura;
        this.dataDeVencimento = dataDeVencimento;
    }
}
