package Exercicios_LacosDecisao_Aula2;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int N;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um n�mero inteiro: ");
		N = leia.nextInt();
		
		if(N%2==0)
		{
			if(N>=0)
			{
				System.out.println("\nEste n�mero � par e positivo");
			}
			else
			{
				System.out.println("Este n�mero � par e negativo");
			}
		}
		else
		{
			if(N>=0)
			{
				System.out.println("\nEste n�mero � �mpar e positivo");
			}
			else
			{
				System.out.println("Este n�mero � �mpar e negativo");
			}
		}
		
		
		/*
		 4) Fa�a um sistema que leia um n�mero inteiro 
		 e mostre uma mensagem indicando se este n�mero � par ou �mpar, 
		 e se � positivo ou negativo.
		 */

	}

}
