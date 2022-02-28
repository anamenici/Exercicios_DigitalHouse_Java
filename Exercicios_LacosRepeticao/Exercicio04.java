package Exercicios_LacosRepeticao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		int x = 0;
		int calmo = 0;
		int mulherNervosa = 0;
		int homemAgressivo = 0;
		int outrosCalmos = 0;
		int plus40Nervosa = 0;
		int less18Calma = 0;
		
				
		Scanner leia = new Scanner(System.in);
		
		while(x<=150) 
		{
			System.out.println("\nQual é sua idade: ");
			int idade = leia.nextInt();
			System.out.println("\nQual é seu sexo (1-feminino / 2-masculino / 3-Outros): ");
			int sexo = leia.nextInt();
			System.out.println("\nQual é sua característica psicológica "
					+ "(1, se for calma; 2, se for nervosa e 3, se for agressiva): ");
			int psique = leia.nextInt();
			x++;
			
			if(psique==1) 
			{
				calmo++;
			}
			else if(sexo==1 && psique==2) 
			{
				mulherNervosa++;
			}
			else if(sexo==2 && psique==3)
			{
				homemAgressivo++;
			}
			else if(sexo==3 && psique==1)
			{
				outrosCalmos++;
			}
			else if(psique==2 && idade>40)
			{
				plus40Nervosa++;
			}
			else if(psique==1 && idade<18)
			{
				less18Calma++;
			}
			
		}
		System.out.printf("\nO número de pessoas calmas é %d; \n"
				+ "O número de mulheres nervosas é %d; \n"
				+ "O número de homens agressivos é %d; \n"
				+ "O número de outros calmos é %d; \n"
				+ "O número de pessoas nervosas com mais de 40 anos é %d; \n"
				+ "O número de pessoas calmas com menos de 18 anos é %d."
				+ "", calmo, mulherNervosa, homemAgressivo, outrosCalmos, plus40Nervosa, less18Calma);
		
		
		/* Uma empresa desenvolveu uma pesquisa para saber as características psicológicas 
		 * dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado: 
		 * idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
		 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.

		 */

	}

}
