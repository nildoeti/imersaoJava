package br.eti.nildo.ControleDecisao;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		/*
		 * Desvio condicional composto
		 * 
		 * A tomada de decisão composta if/else, é processado indepedente de a 
		 * condição for verdadeira ou não.
		 * 
		 * Programa que solicita a idade de uma pessoa e compara se idade
		 * é maior que 18 anos exibe: "É maior de idade", 
		 * se não for maior que 18 anos exibe: "É menor de idade."
		 * 
		 */
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma idade: ");
		int idade = entrada.nextInt();
		
		if (idade >= 18) {
			System.out.println("É maior de idade.");
		} else {
			System.out.println("É menor de idade");
		}

	}

}
