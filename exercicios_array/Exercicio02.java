package exercicios_array;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		int[] lancamentos = new int[9];
		int x, somaLancamentos=0, seis=0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0; x<9; x++)
		{
			System.out.println("\nJogue o dado e digite o resultado \n(Lançamento "+(x+1)+"/10): ");
			lancamentos[x] = leia.nextInt();
			while(lancamentos[x]<1 || lancamentos[x]>6)
			{
				System.out.println("\nNúmero inválido... Só são aceitos números de 1 a 6..."
						+ "\nDigite o resultado do Lançamento "+(x+1)+"/10: ");
				lancamentos[x] = leia.nextInt();
			}
			somaLancamentos += lancamentos[x];
			
			if(lancamentos[x]==6)
			{
				seis++;
			}
		}
		media = somaLancamentos/10;
		System.out.println("\nA média dos lançamentos foi: "+media);
		System.out.println("\nA ocorrência do maior número foi: "+seis);

		/*
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado.Faça um programa que gere um vetor com
		 * os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, 
		 * contabilize e apresente também quantas foram as ocorrências do maior lançamento.
		 */
	}

}
