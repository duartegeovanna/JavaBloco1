package Introducao;

import java.util.Scanner;

public class Atividade4 {

	/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, elevado;
		
		System.out.print("Digite o n�mero: ");
		numero=ler.nextInt();
		
		if (numero%2==0) {
			
			System.out.println("O n�mero � par");
			System.out.println("E sua raiz quadrada �: " + Math.sqrt(numero));
		}
		else {
			elevado = numero*numero;
			System.out.println("O n�mero � �mpar");
			System.out.println("Esse n�mero elevado ao quadrado �: " + elevado);
		}

	}

}
