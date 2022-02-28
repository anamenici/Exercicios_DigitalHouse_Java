package Exercicios_LacosRepeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
	int age, less21=0, plus50=0;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nDigite a idade: ");
	age = leia.nextInt();
	
	while(age!=-99)
	{
		if(age<21) 
		{
			less21++;
		}
		else if(age>50)
		{
			plus50++;
		}
		System.out.println("\nDigite a idade: ");
		age = leia.nextInt();
	}
	
	System.out.printf("\nResultado: \n%d pessoa(s) menor(es) de 21 anos; "
			+ "\n%d pessoa(s) maior(es) de 50 anos.", less21, plus50);
	
		
		
		
		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
		 */

	}

}
