package Introducao;

import java.util.Scanner;

public class Atividade3 {

	/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
	categoria ela se encontra:
		 10-14 infantil
		 15-17 juvenil
		 18-25 adulto*/
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.print("Digite a sua idade: ");
		idade=leia.nextInt();
		
		if (idade==10 || idade<=14) {
			System.out.println("Infatil");
		}
		else if (idade==15 || idade<=17) {
			System.out.println("Juvenil");
		}
		else {
			System.out.println("Adulto");
		}
	}

}
