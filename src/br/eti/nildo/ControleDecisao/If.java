package br.eti.nildo.ControleDecisao;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		/*
		 * Programa que solicita a idade de uma pesspa e compara se idade
		 * é maior que 18.
		 * 
		 * 
		 */
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma idade: ");
		int idade = entrada.nextInt();
		
		if (idade >= 18) {
			System.out.println("É maior de idade.");
		}

	}

}
