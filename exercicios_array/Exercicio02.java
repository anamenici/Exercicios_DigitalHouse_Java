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
			System.out.println("\nJogue o dado e digite o resultado \n(Lan�amento "+(x+1)+"/10): ");
			lancamentos[x] = leia.nextInt();
			while(lancamentos[x]<1 || lancamentos[x]>6)
			{
				System.out.println("\nN�mero inv�lido... S� s�o aceitos n�meros de 1 a 6..."
						+ "\nDigite o resultado do Lan�amento "+(x+1)+"/10: ");
				lancamentos[x] = leia.nextInt();
			}
			somaLancamentos += lancamentos[x];
			
			if(lancamentos[x]==6)
			{
				seis++;
			}
		}
		media = somaLancamentos/10;
		System.out.println("\nA m�dia dos lan�amentos foi: "+media);
		System.out.println("\nA ocorr�ncia do maior n�mero foi: "+seis);

		/*
		 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado.Fa�a um programa que gere um vetor com
		 * os lan�amentos, escreva esse vetor. A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, 
		 * contabilize e apresente tamb�m quantas foram as ocorr�ncias do maior lan�amento.
		 */
	}

}
