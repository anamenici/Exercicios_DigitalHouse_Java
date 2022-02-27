package Exercicios_LacosDecisao_Aula2;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/* 1) Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar 
		o rendimento di�rio de seu trabalho. Toda vez que ele traz um peso de tomate maior 
		que o estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) deve pagar um 
		multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P 
		(peso de tomates) e verifique se h� excesso. 
		Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa que Jo�o dever� pagar. 
		Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
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
			System.out.println("\n N�o houve excesso de peso de tomates");
		}
	}

}
