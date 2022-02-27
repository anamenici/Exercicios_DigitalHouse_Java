package Exercicios_LacosDecisao_Aula2;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int N;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um número inteiro: ");
		N = leia.nextInt();
		
		if(N%2==0)
		{
			if(N>=0)
			{
				System.out.println("\nEste número é par e positivo");
			}
			else
			{
				System.out.println("Este número é par e negativo");
			}
		}
		else
		{
			if(N>=0)
			{
				System.out.println("\nEste número é ímpar e positivo");
			}
			else
			{
				System.out.println("Este número é ímpar e negativo");
			}
		}
		
		
		/*
		 4) Faça um sistema que leia um número inteiro 
		 e mostre uma mensagem indicando se este número é par ou ímpar, 
		 e se é positivo ou negativo.
		 */

	}

}
