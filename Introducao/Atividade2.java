package Introducao;

import java.util.Scanner;

public class Atividade2 {
	//Faça um programa que entre com três números e coloque em ordem crescente.
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.print("Digite o primeiro número: ");
		n1=ler.nextInt();
		
		System.out.print("Digite o segundo número: ");
		n2=ler.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		n3=ler.nextInt();
		
		if (n1 >= n2 && n1 >= n3 && n2 >= n3) {

			System.out.println(n3 + " - " + n2 + " - " + n1);
			
		} else if (n1 >= n2 && n1 >= n3 && n3 >= n2) {

			System.out.println(n2 + " - " + n3 + " - " + n1);
			
		} else if (n2 >= n1 && n2 >= n3 && n1 >= n3) {

			System.out.println(n3 + " - " + n1 + " - " + n2);
			
		} else if (n2 >= n1 && n2 >= n3 && n3 >= n1) {

			System.out.println(n1 + " - " + n3 + " - " + n2);
			
		} else if (n3 >= n1 && n3 >= n2 && n2 >= n1) {

			System.out.println(n1 + " - " + n2 + " - " + n3);
			
		} else if (n3 >= n1 && n3 >= n2 && n1 >= n2) {

			System.out.println(n2 + " - " + n1 + " - " + n3);
			
		} else {
			System.out.println("Entre com um valor válido.");
		}
		
		ler.close();
		
	}

}
