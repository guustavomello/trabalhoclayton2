package main;
import java.util.Scanner;

public class BarRelatorio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

////////////////////////////////////////////////////////////////////////////////////////
//				CODIGO BY: GUSTAVO MELLO 4 FASE CIÊNCIA DA COMPUTAÇÃO
///////////////////////////////////////////////////////////////////////////////////////
		
        //seta as variaveis e o preco de cada uma
        final double PRECO_INGRESSO_HOMEM = 10.0;
        final double PRECO_INGRESSO_MULHER = 8.0;
        final double PRECO_CERVEJA = 5.0;
        final double PRECO_REFRIGERANTE = 3.0;
        final double PRECO_ESPETINHO = 7.0;
        final double COUVERT_ARTISTICO = 4.0;
        final double LIMITE_CONSUMO_ISENCAO_COUVERT = 30.0;

        // recebe as informacoes do cliente
        System.out.print("Informe o sexo do cliente (M ou F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Informe a quantidade de cervejas consumidas: ");
        int qtdCervejas = scanner.nextInt();

        System.out.print("Informe a quantidade de refrigerantes consumidos: ");
        int qtdRefrigerantes = scanner.nextInt();

        System.out.print("Informe a quantidade de espetinhos consumidos: ");
        int qtdEspetinhos = scanner.nextInt();

        // faz o calculo do valor do ingresso
        double valorIngresso = (sexo == 'M') ? PRECO_INGRESSO_HOMEM : PRECO_INGRESSO_MULHER;

        // faz o calculo do valor do consumo
        double valorConsumo = (qtdCervejas * PRECO_CERVEJA) + (qtdRefrigerantes * PRECO_REFRIGERANTE) + (qtdEspetinhos * PRECO_ESPETINHO);

        // verifica se o couvert artistico vai ser cobrado
        double valorCouvert = (valorConsumo > LIMITE_CONSUMO_ISENCAO_COUVERT) ? 0.0 : COUVERT_ARTISTICO;

        // soma tudo e joga dentro da varivavel "valorTotal"
        double valorTotal = valorIngresso + valorConsumo + valorCouvert;

        // mostra o relatorio final
        System.out.println("\n----- Relatório da Conta -----");
        System.out.printf("Ingresso: R$ %.2f%n", valorIngresso);
        System.out.printf("Consumo: R$ %.2f%n", valorConsumo);
        System.out.printf("Couvert Artístico: R$ %.2f%n", valorCouvert);
        System.out.printf("Total a pagar: R$ %.2f%n", valorTotal);
	}

}
