package Aula04;

import java.util.Scanner;

public class CalculadoraJurosSimples {

     public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora de Juros Simples");

        // Salva os dados da compra digitado pelo usuario
        System.out.println("Digite o valor da Compra:");
        int compra = scanner.nextInt();

        System.out.println("Digite a Taxa do Juros:");
        int juros = scanner.nextInt();

        System.out.println("Quantas vezes Dividiu?");
        int divid = scanner.nextInt();
            
        // Faz a conta para sabermos o juros com bases na % e pelo mes 
        int juros2 = (compra * juros * divid) / 100;

        // Sabemos quanto de Juros deu por mês
        int jurosmes = (juros2) / 2;

        // Faz a conta do valor total + a Taxa
        int soma = (compra) + (juros2);
        System.out.println("Voce ira ter R$" + jurosmes + " por mes de juros, ao total a é de fatura " + soma);
        
    }
}

