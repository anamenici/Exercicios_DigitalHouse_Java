package Exercicios_LacosDecisao_Aula2;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		double n1, n2, n3, n4, n1q, n2q, n3q, n4q;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro n�mero: ");
		n1 = leia.nextDouble();
		System.out.println("\nDigite o segundo n�mero: ");
		n2 = leia.nextDouble();
		System.out.println("\nDigite o terceiro n�mero: ");
		n3 = leia.nextDouble();
		System.out.println("\nDigite o quarto n�mero: ");
		n4 = leia.nextDouble();
		
		n1q = Math.pow(n1, 2);
		n2q = Math.pow(n2, 2);
		n3q = Math.pow(n3, 2);
		n4q = Math.pow(n4, 2);
		
		if(n3q>=1000)
		{
			System.out.println("\nn3 ao quadrado �: " + n3q);
		}
		else {
			System.out.println("\nn1 ao quadrado �: " + n1q);
			System.out.println("\nn2 ao quadrado �: " + n2q);
			System.out.println("\nn3 ao quadrado �: " + n3q);
			System.out.println("\nn4 ao quadrado �: " + n4q);
		}
/*3) Desenvolva um sistema em que:
Leia 4 (quatro) n�meros;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contr�rio, imprima os valores lidos e seus respectivos quadrados.
 */
	}

}
