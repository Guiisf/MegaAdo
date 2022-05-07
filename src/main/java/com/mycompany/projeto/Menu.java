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
			System.out.print("Digite a opção escolhida: ");
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

					System.out.println("Podemos ir a praia? ");
					System.out.println("Digite a temperatura atual: ");
					temperatura = input.nextInt();
					System.out.println("Digite o orçamento: ");
					orçamento = input.nextFloat();

					do {
						System.out.println("Selecione a condição do tempo: ");
						System.out.println("A) Sol");
						System.out.println("B) Nublado");
						System.out.println("C) Garoa");
						System.out.println("D) Chuva");
						System.out.println();
						tempo = input.nextLine();

					} while (("A) Sol".equals(tempo)) && ("B) Nublado".equals(tempo)) && ("C) Garoa".equals(tempo)) && ("D) Chuva".equals(tempo)) && ("A".equals(tempo))
						&& "B".equals(tempo) && ("C".equals(tempo)) && ("D".equals(tempo)));

				case "5":
					int consumo;
					System.out.println("Informe o consumo em kWh");
					consumo = input.nextInt();

					double Tarifa,
					 tarifadistri;

					Tarifa = 0.28738;
					tarifadistri = 0.30711;

					System.out.println("O valor da sua conta e R$: " + ((consumo * Tarifa) + (consumo * tarifadistri)));

					break;
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
