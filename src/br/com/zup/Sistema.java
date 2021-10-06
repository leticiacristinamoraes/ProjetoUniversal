package br.com.zup;

import java.util.Scanner;

public class Sistema {
    private static Scanner receberDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu(){
        System.out.println("Bem vinde a Space Negócios *-*");
        System.out.println("Digite 1 para cadastrar um novo consumidor.");
        System.out.println("Digite 2 para cadastrar uma nova fatura.");
        System.out.println("Digite 3 para sair do sistema.");
    }

    public static Consumidor cadastrarConsumidor(){
        String nome = receberDados("Informe o nome do consumidor:").nextLine();
        String email = receberDados("Informe o email do consumidor:").nextLine();
        return ServiceConsumidor.cadastrarConsumidor(nome, email);
    }
}
