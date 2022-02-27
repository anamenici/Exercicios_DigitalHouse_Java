package Exercicios_LacosDecisao_Aula2;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/* 1) João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar 
		o rendimento diário de seu trabalho. Toda vez que ele traz um peso de tomate maior 
		que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar um 
		multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P 
		(peso de tomates) e verifique se há excesso. 
		Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. 
		Caso contrário mostrar tais variáveis com o conteúdo ZERO.
		*/
		float P, E, M;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\n Digite quantos kilos de tomate: ");
		P = leia.nextFloat();
		
		if(P>50)
		{
			E = P-50;
			M = E*4;
			System.out.printf(" Para %4.2fkg de tomates, temos: \n\t"
					+ " %4.2fkg de excesso e uma multa de R$%4.2f.",P, E, M);
		}
		else 
		{
			E = 0;
			M = 0;
			System.out.println("\n Não houve excesso de peso de tomates");
		}
	}

}
