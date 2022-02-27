package Exercicios_LacosDecisao_Aula2;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a idade do nadador: ");
		idade = leia.nextInt();
		
		if(idade<5) 
		{
			System.out.println("Idade inválida. Só aceitamos nadadores a partir de 5 anos de idade.");
		}
		else if(idade>=5 && idade<8)
		{
			System.out.println("A idade de "+idade+" anos é considerada categoria Infantil A.");
		}
		else if(idade>=8 && idade<12)
		{
			System.out.println("A idade de "+idade+" anos é considerada categoria Infantil B.");
		}
		else if(idade>=12 && idade<14)
		{
			System.out.println("A idade de "+idade+" anos é considerada categoria Juvenil A.");
		}
		else if(idade>=14 && idade<18)
		{
			System.out.println("A idade de "+idade+" anos é considerada categoria Juvenil B.");
		}
		else
		{
			System.out.println("A idade de "+idade+" anos é considerada categoria Adulto.");
		}
	
		/*
		 * 6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
           Infantil A = 5 a 7 anos
           Infantil B = 8 a 11 anos
           Juvenil A = 12 a 13 anos
           Juvenil B = 14 a 17 anos
           Adultos = Maiores de 18 anos
		 */

	}

}
