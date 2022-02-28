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
			System.out.println("\nQual � sua idade: ");
			int idade = leia.nextInt();
			System.out.println("\nQual � seu sexo (1-feminino / 2-masculino / 3-Outros): ");
			int sexo = leia.nextInt();
			System.out.println("\nQual � sua caracter�stica psicol�gica "
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
		System.out.printf("\nO n�mero de pessoas calmas � %d; \n"
				+ "O n�mero de mulheres nervosas � %d; \n"
				+ "O n�mero de homens agressivos � %d; \n"
				+ "O n�mero de outros calmos � %d; \n"
				+ "O n�mero de pessoas nervosas com mais de 40 anos � %d; \n"
				+ "O n�mero de pessoas calmas com menos de 18 anos � %d."
				+ "", calmo, mulherNervosa, homemAgressivo, outrosCalmos, plus40Nervosa, less18Calma);
		
		
		/* Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas 
		 * dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas era perguntado: 
		 * idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es 
		 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
o n�mero de pessoas calmas; 
o n�mero de mulheres nervosas; 
o n�mero de homens agressivos; 
o n�mero de outros calmos;
o n�mero de pessoas nervosas com mais de 40 anos; 
o n�mero de pessoas calmas com menos de 18 anos.

		 */

	}

}
