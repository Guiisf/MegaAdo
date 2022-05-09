package com.mycompany.projeto;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Menu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Return of the hero: The Dragons Death");
            System.out.println();
            System.out.println("Menu do Jogo:");
            System.out.println("1) Creditos;");
            System.out.println("2) Viajem a Praia;");
            System.out.println("3) Desconto;");
            System.out.println("4) Imc;");
            System.out.println("5) Conta de Luz;");
            System.out.println("6) Conta de Agua;");
            System.out.println("7) Sair;");
            System.out.println();
            System.out.print("Digite a opcao escolhida: ");
            choice = input.nextLine();
            System.out.println();

            switch (choice) {
                case "1":
                    System.out.println("Créditos: ");
                    System.out.println(" - Bruno Henrique Souza;");
                    System.out.println(" - Guilherme de Souza Ferreira;");
                    System.out.println(" - Italo Santos Silva;");
                    System.out.println(" - Heron Ramos");
                    System.out.println();

                    break;
                case "2":
                    String tempo;
                    int i = 0;
                    int temperatura;
                    float orçamento;

                    do {
                        System.out.println("Podemos ir a praia? ");

                        System.out.println("Selecione a letra da condição do tempo: ");
                        System.out.println("A) Sol");
                        System.out.println("B) Nublado");
                        System.out.println("C) Garoa");
                        System.out.println("D) Chuva");
                        System.out.println();
                        tempo = input.nextLine();

                        System.out.println("Digite a temperatura atual: ");
                        temperatura = input.nextInt();
                        System.out.println("Digite o orçamento: ");
                        orçamento = input.nextFloat();

                    } while (("A) Sol".equals(tempo)) && ("B) Nublado".equals(tempo)) && ("C) Garoa".equals(tempo)) && ("D) Chuva".equals(tempo)) && ("A".equals(tempo))
                            && "B".equals(tempo) && ("C".equals(tempo)) && ("D".equals(tempo)));
                    if (temperatura >= 25 && orçamento >= 2000 && "A".equals(tempo) && "B".equals(tempo)) {
                        System.out.println("BORA PRA PRAIA!");

                    } else {
                        System.out.println("Não é uma boa ideia ir a praia :(");
                    }
                    break;
                case "3":
			System.out.println("Desconto de 10% no produto");
                     float valorUnitario;
        int unidade;
        float total;
        System.out.println("Digite o valor da Unidade");
        valorUnitario = input.nextFloat();
        System.out.println("Digite a quantidade de Produtos");
        unidade = input.nextInt();
        total = (unidade * valorUnitario);
        if (unidade < 10) {
            System.out.printf("Valor a Pagar" + total + "\n");
        } else { 
            System.out.println(" Valor a Pagar "  +  (total - ( total * 0.10)));

        // Print F , linguagem C. É necessário colocar o \n para obter a mesma funcionalidade do println
    
    }
	break;

                case "5":
                    int consumo;
                    System.out.println("Informe o consumo em kWh");
                    consumo = input.nextInt();

                    double Tarifa,
                     tarifadistri;

                    Tarifa = 0.28738;
                    tarifadistri = 0.307111;

                    System.out.println("O valor da sua conta e R$: " + ((consumo * Tarifa) + (consumo * tarifadistri)));

                    break;
		    case"7":
			    System.exit(0);
            }
            
        } while (("1) Creditos".equals(choice))
                && ("2) Viajem a Praia".equals(choice)) && ("3) Desconto".equals(choice)) && ("4) Imc".equals(choice)) && ("5) Conta de Luz".equals(choice))
                && ("6) Conta de Agua".equals(choice)) && ("1".equals(choice))
                && "2".equals(choice)
                && ("3".equals(choice)) && ("4".equals(choice)) && ("5".equals(choice)) && ("6".equals(choice)));
        if (("7) Sair".equals(choice)
                && ("7".equals(choice)))) {
            System.out.println("Você saiu do jogo!");
            System.out.println();
        } else {
            System.out.println("Comando Inválido");
            System.out.println();
        }
    }
}
