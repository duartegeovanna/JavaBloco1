package LacosRepeticao;

import java.util.Scanner;

public class RepeticaoDoWhile {

	/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.*/
	
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero, soma=0;
		
		do 
		{
			System.out.print("Digite um n�mero: \n");
			numero = leia.nextInt();
			soma = soma+numero;
			
		}while(numero>0);
		System.out.printf("A soma dos numeros digitados �: %d", soma);
	}
}
