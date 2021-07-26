package br.eti.nildo.Array;

public class ArrayMultidimensionais2 {

	public static void main(String[] args) {
		/*
		 * Também podemos usar um for loopdentro de outro for looppara obter os
		 * elementos de uma matriz bidimensional (ainda temos que apontar para os 
		 * dois índices): 
		 * 
		 */
		
		int [][] meusNumeros = {{1, 2, 3, 4, 5}, {6, 7}};
		
		for (int i = 0; i < meusNumeros.length; i++) {
			for (int j = 0; j < meusNumeros[i].length; j++) {
				System.out.println(meusNumeros[i][j]);
			}
		}

	}

}
