package Algoritmo73_LerNumeroRealCalculaImprime;

import java.util.Scanner;

public class Algoritmo73_LerNumeroRealCalculaImprime {

	public static void main(String[] args) {
		algoritmo73_LerNumeroRealCalculaImprime();
	}	
		
	public static void algoritmo73_LerNumeroRealCalculaImprime(){
		
		/* Criar um algoritmo que receba um número real, calcular e imprimir:
		• a parte inteira do número • a parte fracionária do número • o número arredondado */
		
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
