package Exercicios_LacosRepeticao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		int numero, soma=0;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um n�mero do teclado: ");
			numero = leia.nextInt();
			soma += numero;
		}
		while(numero!=0);
		
		System.out.println("\nA soma dos n�meros digitados �: "+soma);
		
		/*
		 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero 
		 * igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		 */

	}

}
