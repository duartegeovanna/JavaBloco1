package Introducao;

import java.util.Scanner;

public class Atividade2 {
	//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.print("Digite o primeiro n�mero: ");
		n1=ler.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		n2=ler.nextInt();
		
		System.out.print("Digite o terceiro n�mero: ");
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
			System.out.println("Entre com um valor v�lido.");
		}
		
		ler.close();
		
	}

}
