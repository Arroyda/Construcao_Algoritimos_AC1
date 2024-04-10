package Aula04;

import java.util.Scanner;

public class CalculadoraAreaQuadrado {
     public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora de Perimetro Quadrado Qualquer");

        // Salva o tamanho da Base digitado pelo usuario
        System.out.println("Digite o tamanho de 1 dos lados do Quadrado:");
        int base = scanner.nextInt();
            
        //Faz a multiplicação do Perimetro do Retangulo
        int multiplicacao = (base) * (base);
        System.out.println("O Perimetro do Quadrado é = " + multiplicacao);
        
    }
}
