package exercicios_array;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		float[] pontuacao = new float[5];
		float maiorPontuacao=0;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0; x<5; x++)
		{
			System.out.println("\nEntre com a nota "+(x+1)+": ");
			pontuacao[x] = leia.nextFloat();
		}
		
		for(x=0;x<5;x++)
		{
			if(pontuacao[x]>maiorPontuacao)
			{
				maiorPontuacao = pontuacao[x];
			}
		}
		
		System.out.println("\nA maior pontua��o foi: "+maiorPontuacao);
		
		/*
		 * Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade
		 * e o escreva em seguida.Encontre ap�s a maior pontua��o e a apresente.
		 */
	}

}
