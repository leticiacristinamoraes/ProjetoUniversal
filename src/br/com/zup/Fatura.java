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

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    public double getValorDaFatura() {
        return valorDaFatura;
    }

    public void setValorDaFatura(double valorDaFatura) {
        this.valorDaFatura = valorDaFatura;
    }

    public String getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Detalhes da fatura:\n");
        retorno.append("\n Consumidor: " + consumidor);
        retorno.append("\n Valor da fatura: R$ " + valorDaFatura);
        retorno.append("\n A data de vencimento da fatura é: " + dataDeVencimento);
        return retorno.toString();
    }
}
