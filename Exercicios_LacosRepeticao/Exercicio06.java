package Exercicios_LacosRepeticao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		int numero, soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("\n(Digite 0 para sair)\nDigite um n�mero inteiro: ");
			numero = leia.nextInt();
			if(numero%3==0)
			{
				soma+=numero;
			}
		}
		while(numero!=0);
		System.out.println("\nA soma dos multiplos de 3 �: "+soma);
		
		/*
		 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir 
		 * a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
		 */

	}

}
