package Aula04;

import java.util.Scanner;

public class CalculadoraRaizCubica {
     
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora de Raiz Cubica");

        // Salva o numero digitado pelo usuario
        System.out.println("Digite o Numero:");
        int num = scanner.nextInt();
            
        //Faz a multiplicação do Numero trasnformando em Raiz Cubica
        int multiplicacao = (num) * (num) * (num) ;
        System.out.println("O resultado do Numero em Raiz Cubica é = " + multiplicacao);
        
    }
}
