package atividades_vetor;

import java.util.Scanner;

public class LocalizaNumeros {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int pesqNumero = 0;
		int indice;

		System.out.println("--- LOCALIZA UM NÚMERO DENTRO DE UM VETOR ---\n");

		System.out.printf("Qual número você deseja localizar? ");
		pesqNumero = leia.nextInt();

		for (indice = 0; indice < 10; indice++) {
			if (pesqNumero == vetorInteiros[indice]) {
				System.out.printf("\nO número %d está localizado na posição %d", pesqNumero, indice);
				indice = 11;
			}

		}

		if (indice == 10) {
			System.out.printf("\nO número %d não foi encontrado!", pesqNumero);

		}

	}

}
