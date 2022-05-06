package Introducao;

import java.util.Scanner;

public class Atividade1 {
//Faça um programa que receba três inteiros e diga qual deles é o maior.
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3, maiorNumero=0;
		
		System.out.print("Digite o primeiro número: ");
		n1=ler.nextInt();
		
		System.out.print("Digite o segundo número: ");
		n2=ler.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		n3=ler.nextInt();
		
		if (n1>n2 && n1>n3) {
			System.out.println("O maior número é: " + n1);
		}
		else if (n2>n1 && n2>n3) {
			System.out.println("O maior número é: " + n2);
		}
		else if (n3>n1 && n3>n2) {
			System.out.println("O maior número é: " + n3);
		}
	}
}
