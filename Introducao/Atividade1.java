package Introducao;

import java.util.Scanner;

public class Atividade1 {
//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3, maiorNumero=0;
		
		System.out.print("Digite o primeiro n�mero: ");
		n1=ler.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		n2=ler.nextInt();
		
		System.out.print("Digite o terceiro n�mero: ");
		n3=ler.nextInt();
		
		if (n1>n2 && n1>n3) {
			System.out.println("O maior n�mero �: " + n1);
		}
		else if (n2>n1 && n2>n3) {
			System.out.println("O maior n�mero �: " + n2);
		}
		else if (n3>n1 && n3>n2) {
			System.out.println("O maior n�mero �: " + n3);
		}
	}
}
