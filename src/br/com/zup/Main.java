package br.com.zup;

public class Main {

    public static void main(String[] args) {
	Consumidor consumidor = new Consumidor("Luis", "luis@luis");
	Fatura fatura = new Fatura(consumidor,800, "12/10/2021");

        System.out.println(fatura);
    }
}
