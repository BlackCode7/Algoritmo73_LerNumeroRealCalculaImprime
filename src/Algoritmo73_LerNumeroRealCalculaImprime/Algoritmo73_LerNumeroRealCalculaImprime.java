package Algoritmo73_LerNumeroRealCalculaImprime;

import java.util.Scanner;

public class Algoritmo73_LerNumeroRealCalculaImprime {

	public static void main(String[] args) {
		algoritmo73_LerNumeroRealCalculaImprime();
	}	
		
	public static void algoritmo73_LerNumeroRealCalculaImprime(){
		
		/* Criar um algoritmo que receba um n�mero real, calcular e imprimir:
		� a parte inteira do n�mero � a parte fracion�ria do n�mero � o n�mero arredondado */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com um numero com parte fracionaria: ");
		
		double numReal = scanner.nextDouble();
		double partInt = (long)numReal;		
		double parte = numReal - partInt;
		
		System.out.println("Parte real digitado: " + numReal);
		System.out.println("Parte parte inteira: "+ partInt);
		System.out.println("Parte parte:" + parte);
		
	}

}
