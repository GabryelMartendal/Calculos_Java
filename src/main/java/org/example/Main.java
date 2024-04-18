package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Local de declaração de variáveis
        Scanner scanner = new Scanner(System.in);
        int menu = 0;

        //Seção do layout do menu
        System.out.println("+----------------------------------------------------------+");
        System.out.println("|                  Programa de Resolução                   |");
        System.out.println("|                       de Cálculos                        |");
        System.out.println("+----------------------------------------------------------+");
        System.out.println();
        System.out.println("        Bem vindo ao programa de resolução de cálculos");
        System.out.println();
        System.out.println("+----------------------------------------------------------+");
        System.out.println("| Escolha a opção desejada:                                |");
        System.out.println("| 1 - Conversor de moedas 💎                               |");
        System.out.println("| 2 - Conversor de medidas 📏                              |");
        System.out.println("| 3 - Conversor de temperaturas 💥                         |");
        System.out.println("+----------------------------------------------------------+");
        //Lê a entrada do teclado do usuário
        System.out.print("Opção: ");
        menu = scanner.nextInt();

        //Execução do menu no nível correto

        switch (menu) {
            case 1:
                System.out.println("Entrou na conversão de moedas. 💎");
                break;
            case 2:
                System.out.println("Entrou na conversão de medidas. 📏");
                break;
            case 3:
                System.out.println("Entrou na conversão de temperatura. 💥");
                break;
            default:
                System.out.println("Opção Invalida.");
                break;
        }


        //Execução do menu no nível complicado <––––––––––––––––––––––––
        //if (menu == 1) {
       //     System.out.println("Entrou no conversor de moedas.");
      //  } else {//se você digitou o valou 1, executa isso
    //        if (menu == 2) {
             //   System.out.println("Entrou no conversor de medidas.");
        //    } else {//se você digitou o valou 2, executa isso
          //      if (menu == 3) {
            //        System.out.println("Entrou no conversor de temperatura.");
        //        } else {
                    //se você não digitou o valou 3, executa isso
            //        System.out.println("Opção Invalida.");
           //     }

        //    }
  //      }

    }
}