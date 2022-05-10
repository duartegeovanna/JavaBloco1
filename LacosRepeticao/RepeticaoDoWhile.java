package LacosRepeticao;

import java.util.Scanner;

public class RepeticaoDoWhile {

	/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.*/
	
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero, soma=0;
		
		do 
		{
			System.out.print("Digite um número: \n");
			numero = leia.nextInt();
			soma = soma+numero;
			
		}while(numero>0);
		System.out.printf("A soma dos numeros digitados é: %d", soma);
	}
}
