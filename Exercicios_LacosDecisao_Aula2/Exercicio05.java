package Exercicios_LacosDecisao_Aula2;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		float indice;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o �ndice de polui��o atual: ");
		indice = leia.nextFloat();
		
		if(indice>=0.3 && indice<0.4)
		{
			System.out.println("Ind�strias do 1� grupo devem suspender suas atividades!");
		}
		else if(indice>=0.4 && indice<0.5)
		{
			System.out.println("Ind�strias do 2� e 3� grupo devem suspender suas atividades!!");
		}
		else if(indice>=0.5)
		{
			System.out.println("Todas as ind�strias devem suspender suas atividades!!!");
		}
		else
		{
			System.out.println("Nenhuma ind�stria precisa suspender atividade.");
		}
		
		
		/*
		 5) A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de 
		 ind�strias que s�o altamente poluentes do meio ambiente. O �ndice de polui��o aceit�vel 
		 varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas 
		 a suspenderem suas atividades, se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo 
		 s�o intimadas a suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos 
		 devem ser notificados a paralisarem suas atividades. Fa�a um sistema que leia o �ndice de 
		 polui��o medido e emita a notifica��o adequada aos diferentes grupos de empresas.
		 */

	}

}
