package Exercicios_LacosRepeticao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int pares=0, impares=0;
		float numero;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=1; x<=10; x++)
		{
			System.out.println("\nDigite um n�mero: ");
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
		System.out.printf("Voc� digitou %d n�meros pares e %d n�meros �mpares.", pares, impares);
		
		/*
		 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		 */

	}

}
