package Aula04;

import java.util.Scanner;

public class CalculadoraCelciusFahrenheit {
 
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora de Celcius para Fahrenheit");

        // Salva a Temperatura em Cº digitado pelo usuario
        System.out.println("Digite a Temperatura em Cº:");
        int celcius = scanner.nextInt();
            
        //Faz a Converção de Celcius para Fahrenheit
        double multiplicacao = ((celcius) * 1.8) + 32;
        System.out.println("O Perimetro do Quadrado é = " + multiplicacao);
        
    }

}
