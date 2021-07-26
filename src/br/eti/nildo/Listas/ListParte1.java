package br.eti.nildo.Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListParte1 {

	public static void main(String[] args) {
		/*
		 * Dados uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
		 * 
		 * List notas = new ArrayList(); #antes do java5
		 * List<Double> notas = ArrayList<>(); #generic(jdk5)- diamont operator(jdk7)
		 * ArrayList<Double> notas = ListArray<>();
		 * List<Double> notas = new ArrayList<>(Array.asList(7, 8.5, 9.3, 5, 7, 0, 3.6));
		 * List<Double> notas = Array.asList(7, 8.5, 9.3, 5, 7, 0, 3.6);
		 * notas.add(10d);
		 * System.out.printl(notas);
		 * 
		 * List<Double> notas = List.of(7, 8.5, 9.3, 5, 7, 0, 3.6);
		 * notas.add(1d);
		 * notas.remove(5d);
		 * System.out.println(notas);
		 * 
		 * Resolver estes problemas com a implementação do método LinkdList
		 * Crie uma lista e adicione as sete notas
		 * Exiba a posição da nota 5.0
		 * Adicione na lista a nota 8.0 na posição 4
		 * Substitua a nota 5.0 pela nota 6.0
		 * Confira se a nota 5.0 esta na lista
		 * Exiba todas as notas na ordem em que fora informadas
		 * Exiba a terceira nota adicionada
		 * Exiba a menor nota
		 * exiba a maior nota
		 * Exiba a soma dos valores
		 * Exiba a média das notas
		 * Remova a nota 0
		 * Remova a nota da posição 0
		 * Remova as notas menores que 7 e exiba a lista
		 * Apague toda a lista
		 * Confira se a lista esta vazia
		 * 
		 * Crie uma lista nota2, e coloque todos os elementos da list ArrayList 

		 */
		@SuppressWarnings("resource")
		List<Double> notas = new ArrayList<>();
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		//exibe todos os elementos da lista
		System.out.println(notas.toString());
		//Posição da nota 5.0
		System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));
		
		//Adicione na lista a nota 8.0 na posição 4
		notas.add(4, 8d);
		System.out.println(notas);
		
		//Substitua a nota 5.0 pela nota 6.0
		notas.set(notas.indexOf(5d), 6d);
		System.out.println(notas);
		
		// Confira se a nota 5.0 esta na lista
		System.out.println("Nota 5 está na lista?: " + notas.contains(5d));
		
		// Exiba todas as notas na ordem em que fora informadas
		System.out.println("\nExiba todas as notas na ordem em que fora informadas");
		for (Double nota: notas) System.out.println(nota);
		
		// Exiba a terceira nota adicionada
		System.out.println("\nExiba a terceira nota adicionada");
		System.out.println("Terceira nota que foi adicionada é: " + notas.get(2));
		
		// Exiba a menor nota
		System.out.println("\nMenor nota da lista: " + Collections.min(notas));


	}

}
