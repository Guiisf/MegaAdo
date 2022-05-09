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
                case "4":
                    
        float n1;
        System.out.println("==============================================");
        System.out.println("Calculo de consumo de Àgua em São Paulo por m³");
        System.out.println("   o valor já esta calculando água e esgoto ");
        System.out.println("==============================================");
        System.out.println("Digite a Quantidade de m³ consumido(EX:6,0)");
        n1 = input.nextFloat();
        if (n1 > 0 && n1 < 10) {
            System.out.println("O consumo sera minimo no valor de 58,00 Reais");
            //De 0 a 10 - Água R$ 29,00 / Esgoto R$29,00 (valor mínimo)
        } else {

            if (n1 >= 11 && n1 < 20) {
                System.out.println("valor é " + (29 + (10 - 5) * 4.54) * 2 + " Reais");
                //De 11 a 20 - Água R$ 4,54 por m3 / Esgoto R$ 4,54 por m3
            } else {
                if (n1 >= 21 && n1 < 50) {
                    System.out.println("valor é " + ((29 + 10 * 4.54 + (27 - 20) * 11.33)) * 2 + " Reais");
                    //De 21 a 50 - Água R$ 11,33 por m3 / Esgoto R$ 11,33 por m3
                } else {
                    if (n1 >= 51) {
                        System.out.println("valor é " + (29 + 10 * 4.54 + 30 * 11.33 + (55 - 50) * 12.48) * 2 + " Reais");
                        //Acima de 50 - Água R$ 12,48 por m3 / Esgoto R$ 12,48 por m3
                    } else {
                        
                    }
                }
            }

        }
        System.out.println("==============================================");
    


                
                     

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
                case "6":
                    float  n11;
        System.out.println("==============================================");
        System.out.println("Calculo de consumo de Àgua em São Paulo por m³");
        System.out.println("   o valor já esta calculando água e esgoto ");
        System.out.println("==============================================");
        System.out.println("Digite a Quantidade de m³ consumido(EX:6,0)");
        n11 = input.nextFloat();
        if ( n11>0 && n11<10){
            System.out.println("O consumo sera minimo no valor de 58,00 Reais");
        //De 0 a 10 - Água R$ 29,00 / Esgoto R$29,00 (valor mínimo)
        }else{
           
            if(n11>11 && n11<20){
                System.out.println("valor é " + ((29+(10-5)*4.54))*2+" Reais");
                //De 11 a 20 - Água R$ 4,54 por m3 / Esgoto R$ 4,54 por m3
            }else{
                if(n11>21 && n11<50){
                    System.out.println("valor é " + ((29+10*4.54+(27-20)*11.33))*2+" Reais");
                    //De 21 a 50 - Água R$ 11,33 por m3 / Esgoto R$ 11,33 por m3
                }else{
                    if (n11>51){
                        System.out.println("valor é "+  (29+10*4.54+30*11.33+(55-50)*12.48)*2+" Reais");
                        //Acima de 50 - Água R$ 12,48 por m3 / Esgoto R$ 12,48 por m3
                    }else{
                    }
        System.out.println("==============================================");
                }
            }
           
        }
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
