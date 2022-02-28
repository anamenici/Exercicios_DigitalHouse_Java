package Exercicios_LacosRepeticao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int pares=0, impares=0;
		float numero;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=1; x<=10; x++)
		{
			System.out.println("\nDigite um número: ");
			numero = leia.nextFloat();
			if(numero%2==0) 
			{
				pares++;
			}
			else
			{
				impares++;
			}
			
		}
		System.out.printf("Você digitou %d números pares e %d números ímpares.", pares, impares);
		
		/*
		 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		 */

	}

}
