package br.inf.guaracinesio;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        int opcao = 0;
        double valor = 0;
        Scanner sc = new Scanner(System.in);
        Conversao origem = new Conversao();

        while (opcao != 7) {
            System.out.println("#####################################################");
            System.out.println("Seja bem vindo (a) ao programa de cotação de moedas! \n");
            System.out.println("Menu de Opções:");
            System.out.println("[1] Cotação de Real para Dólar");
            System.out.println("[2] Cotação de Real para Euro");
            System.out.println("[3] Cotação de Real para Guarani");
            System.out.println("[4] Cotação de Dólar para Real");
            System.out.println("[5] Cotação de Euro para Real");
            System.out.println("[6] Cotação de Guarani para Real");
            System.out.println("[7] Sair do programa");
            System.out.println("#####################################################\n");
            System.out.println("Selecione uma das opções válidas acima:");
            opcao = sc.nextInt();

            if (opcao > 0 && opcao < 7) {
                System.out.println("\nDigite o Valor que queira converter: ");
                valor = sc.nextDouble();
            }

            switch (opcao) {
                case 1:
                    System.out.println("Cotação Real -> Dólar\n\n");
                    origem.setMoedaOrigem("BRL");
                    origem.setMoedaDestino("USD");
                    double calcular = origem.calcular(valor);
                    break;
                case 2:
                    System.out.println("Cotação Real -> Euro\n\n");
                    break;
                case 3:
                    System.out.println("Cotação Real -> Guarani\n\n");
                    break;
                case 4:
                    System.out.println("Cotação Dólar -> Real\n\n");
                    break;
                case 5:
                    System.out.println("Cotação Euro -> Real\n\n");
                    break;
                case 6:
                    System.out.println("Cotação Guarani -> Real\n\n");
                    break;
                case 7:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção Inválida\n\n");
                    break;
            }
        }

    }
}