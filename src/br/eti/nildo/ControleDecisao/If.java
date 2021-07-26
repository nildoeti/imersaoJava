package br.eti.nildo.ControleDecisao;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		/*
		 * Programa que solicita a idade de uma pessoa e compara se idade
		 * é maior que 18.
		 * 
		 * A tomada de decisão simples (desvio condicional simples), é processado
		 * apenas se a condição for verdadeira.
		 * Sendo a condição falsa, o programa é encerrado na sequência.
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
