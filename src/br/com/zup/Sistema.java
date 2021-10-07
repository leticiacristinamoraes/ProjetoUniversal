package br.com.zup;

import java.util.List;
import java.util.Scanner;

public class Sistema {
    private static Scanner receberDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("Bem vinde a Space Negócios *-*");
        System.out.println("Digite 1 para cadastrar um novo consumidor.");
        System.out.println("Digite 2 para cadastrar uma nova fatura.");
        System.out.println("Digite 3 para consultar faturas de um consumidor.");
        System.out.println("Digite 4 para sair do sistema.");
    }

    public static Consumidor cadastrarConsumidor() throws Exception {
        String nome = receberDados("Informe o nome do consumidor:").nextLine();
        String email = receberDados("Informe o email do consumidor:").nextLine();
        return ServiceConsumidor.cadastrarConsumidor(nome, email);
    }

    public static Fatura cadastrarFatura() throws Exception {
        String email = receberDados("Informe o email do consumidor:").nextLine();
        double valorDaFatura = receberDados("Informe o valor da fatura:").nextDouble();
        String dataDeVencimento = receberDados("Informe a data de vencimento da fatura:").nextLine();

        return ServiceFatura.cadastrarFatura(email, valorDaFatura, dataDeVencimento);
    }

    public static List<Fatura> pesquisarFaturas() throws Exception {
        String email = receberDados("Informe o email do consumidor:").nextLine();
        ServiceConsumidor.validarEmail(email);
        List<Fatura> faturasDoUsuario = ServiceFatura.pesquisarFaturaPorEmail(email);
        return faturasDoUsuario;
    }

    public static void executar() throws Exception {
        boolean continuar = true;

        while (continuar) {
            menu();
            int opcaoDesejada = receberDados("Digite a ooção desejada:").nextInt();
            if (opcaoDesejada == 1) {
                Consumidor consumidor = cadastrarConsumidor();
                System.out.println(consumidor);
            } else if (opcaoDesejada == 2) {
                Fatura fatura = cadastrarFatura();
                System.out.println(fatura);
            } else if (opcaoDesejada == 3) {
                List<Fatura> faturas = pesquisarFaturas();
                System.out.println(faturas);
            } else if (opcaoDesejada == 4) {
                continuar = false;
                System.out.println("Obrigada por utilizar nosso sistema. Volte sempre! :)");
            } else {
                System.out.println("Por favor, digite uma opção válida!");
            }
        }
    }
}
