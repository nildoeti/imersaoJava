package br.eti.nildo.Array;

public class ArrayMultidimensionais {

	public static void main(String[] args) {
		/*
		 * Uma matriz multidimensional é uma matriz que contém uma ou mais 
		 * matrizes.
		 * Para criar uma matriz bidimensional, adicione cada matriz dentro 
		 * de seu próprio conjunto de colchetes : 
		 * 
		 * Fonte: Url( Fonte: Url(https://www.w3schools.com/java/java_arrays.asp)
		 */

		int [][] meusNumeros = {{1, 2, 3, 4, 5}, {6, 7}};
		int numero = meusNumeros[1][2];
		System.out.println(numero);

	}

}
