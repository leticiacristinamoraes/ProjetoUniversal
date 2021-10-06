package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceFatura {
    private static List<Fatura> faturas = new ArrayList<>();

    public static Fatura cadastrarFatura(String email, double valorDaFatura, String dataDeVencimento) throws Exception {
        Consumidor consumidor = ServiceConsumidor.pesquisarConsumidorPorEmail(email);

        Fatura fatura = new Fatura(consumidor, valorDaFatura, dataDeVencimento);
        faturas.add(fatura);
        return fatura;
    }
}