package LacosRepeticao;

import java.util.Scanner;

public class RepeticaoWhile1 {
 /* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.*/
	
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int idade=0, menos21=0, mais50=0;
		
		while(idade!=-99) {
			
			System.out.print("Digite a sua idade, se for -99 o programa vai encerrar: ");
			idade=leia.nextInt();
			
			if(idade<21 && idade>0)
				menos21 += 1;
			else if(idade>50)
				mais50 += 1;
		}
		System.out.println("O total de pessoas com menos de 21 anos é: "+menos21);
		System.out.println("O total de pessoas com mais de 50 anos é: "+mais50);
		System.out.println("FIM DO PROGRAMA");
	}

}
