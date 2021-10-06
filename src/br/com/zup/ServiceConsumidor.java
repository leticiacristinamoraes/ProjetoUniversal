package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceConsumidor {
    private static List<Consumidor> consumidores = new ArrayList<>();

    public static Consumidor cadastrarConsumidor(String nome, String email) {
        Consumidor consumidor = new Consumidor(nome, email);
        consumidores.add(consumidor);
        return consumidor;
    }

    public static Consumidor pesquisarConsumidorPorEmail(String email) throws Exception {
        for (Consumidor consumidorReferencia : consumidores) {
            if (consumidorReferencia.getEmail().equals(email)) {
                return consumidorReferencia;
            }
        }
        throw new Exception("Consumidor não cadastrado no sistema.");
    }

    public static void validarEmail(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("Informe um email válido!");
        }
    }
}
