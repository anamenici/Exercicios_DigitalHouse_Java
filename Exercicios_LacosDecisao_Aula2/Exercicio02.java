package Exercicios_LacosDecisao_Aula2;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int C;
		float N, salario, salarioE, E;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nEntre com o c�digo do funcion�rio: ");
		C = leia.nextInt();
		
		System.out.print("\nEntre com o total de horas trabalhadas: ");
		N = leia.nextFloat();
		
		if(N>50) 
		{
			E = N-50;
			salarioE = E*20;
			salario = 500 + salarioE;
		}
		else
		{
			E=0;
			salarioE = 0;
			salario = N*10;
			
		}
		
		System.out.printf("O sal�rio total do funcion�rio %s � de R$%4.2f, "
				+ "sendo que R$%3.3f foi proveniente de horas extras.", C, salario, salarioE);
		
		
		/* 2) Elabore um sistema que leia as vari�veis C e N, 
		 * respectivamente c�digo e n�mero de horas trabalhadas de um oper�rio. 
		 * E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora. 
		 * Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento 
		 * armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. 
		 * A hora excedente de trabalho vale R$ 20,00. No final do processamento 
		 * imprimir o sal�rio total e o sal�rio excedente.
		*/
		
	}

}
