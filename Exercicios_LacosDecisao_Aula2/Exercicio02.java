package Exercicios_LacosDecisao_Aula2;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int C;
		float N, salario, salarioE, E;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nEntre com o código do funcionário: ");
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
		
		System.out.printf("O salário total do funcionário %s é de R$%4.2f, "
				+ "sendo que R$%3.3f foi proveniente de horas extras.", C, salario, salarioE);
		
		
		/* 2) Elabore um sistema que leia as variáveis C e N, 
		 * respectivamente código e número de horas trabalhadas de um operário. 
		 * E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
		 * Quando o número de horas exceder a 50 calcule o excesso de pagamento 
		 * armazenando-o na variável E, caso contrário zerar tal variável. 
		 * A hora excedente de trabalho vale R$ 20,00. No final do processamento 
		 * imprimir o salário total e o salário excedente.
		*/
		
	}

}
