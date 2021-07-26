package br.eti.nildo.Array;

public class RecordandoArray {

	public static void main(String[] args) {
		/*
		 * Array's são matrizes de elementos para armazenar conjuntos de 
		 * valores em uma mesma variável.
		 * Para declarar uma variável do tipo Array, basta declarar  tipo e o 
		 * nome da variável com um par de colchetes.
		 * Fonte: Url(https://www.w3schools.com/java/java_arrays.asp)
		 * 
		 */
		String[] carros = {"Volvo", "Mazda", "Ford", "Fiat"};
		// referenciar o número do indíce para exibir o elemento na matriz
		System.out.println("Primeiro elemento da nossa Array de carros: " + carros[0]); 
		
		// para alterar um elemento na Array de elementos
		carros[0] = "Gol";
		System.out.println("Nosso primeiro elemento da Array de carros alterado para: " + carros[0]);
		
		// descobrindo quantos elemento a nossa array possui
		System.out.print("Total de elementos de nossa array é: " + carros.length);
		
		// exibindo todos os elementos da Array carros
		System.out.println("\n\nExibindo todos os item de nossa Array de carros:");
		for (int i = 0; i < carros.length; i++) {
			System.out.println(carros[i]);
		}
		
		// uso de loop com For-Each
		System.out.println("\n	Exibindo todos os item da  nossa Array com uso de loop e For-Each");
		for (String i : carros) {
			System.out.println(i);
		}

	}

}
