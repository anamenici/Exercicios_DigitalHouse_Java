package Exercicios_LacosDecisao_Aula2;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		float N;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		N = leia.nextFloat();
		if(N>100)
		{
			System.out.println("O valor de N �: "+N);
		}
		else
		{
			N=0;
			System.out.println("O valor de N �: "+N);
		}
		
		/*
		 * 8) Construa um sistema para ler uma vari�vel num�rica N e imprimi-la somente se 
		 a mesma for maior que 100, caso contr�rio imprimi-la com o valor zero.
		 */

	}

}
