package Aula04;

import java.util.Scanner;

public class CalculadoraPerimetroRetangulo {
     public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora de Perimetro Retangulo Qualquer");

        // Salva o tamanho da Base digitado pelo usuario
        System.out.println("Digite o tamanho da Base:");
        int base = scanner.nextInt();

        // Salva o tamanho da Altura digitado pelo usuario
        System.out.println("Digite o tamanho da Altura:");
        int altura = scanner.nextInt();
            
        //Faz a multiplicação do Perimetro do Retangulo
        int multiplicacao = (base) + (base) + (altura) + (altura);
        System.out.println("O Perimetro do Retangulo é = " + multiplicacao);
        
    }
}
