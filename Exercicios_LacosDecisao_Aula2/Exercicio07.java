package Exercicios_LacosDecisao_Aula2;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		float base, altura, area;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a medida da base do tri�ngulo: ");
		base = leia.nextFloat();
		
		System.out.println("\nDigite a medida da altura do tri�ngulo: ");
		altura = leia.nextFloat();
		
		if(base>=0 && altura>=0)
		{
			area = (base*altura)/2;
			System.out.println("\nA �rea do tri�ngulo � de: "+area+".");
		}
		else
		{
			System.out.println("\nBase e altura devem maiores que zero.");
		}
		

		/*
		 * 7) Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos 
		 * (positivos maiores que zero). Em caso afirmativo, calcular a �rea do tri�ngulo.
		 */
	}

}
