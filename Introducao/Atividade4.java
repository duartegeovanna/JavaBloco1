package Introducao;

import java.util.Scanner;

public class Atividade4 {

	/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, elevado;
		
		System.out.print("Digite o número: ");
		numero=ler.nextInt();
		
		if (numero%2==0) {
			
			System.out.println("O número é par");
			System.out.println("E sua raiz quadrada é: " + Math.sqrt(numero));
		}
		else {
			elevado = numero*numero;
			System.out.println("O número é ímpar");
			System.out.println("Esse número elevado ao quadrado é: " + elevado);
		}

	}

}
