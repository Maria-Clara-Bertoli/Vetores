package Vetor;

import java.util.Scanner;

public class NumeroSete {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);
		Vetor index = new Vetor();
		System.out.println("Informe quantos nomes serão inseridos: ");
		int quantidade = valor.nextInt();
		String vet[] = new String[quantidade];
		System.out.println("Informe os nomes: ");
		String palavra = valor.next();
		vet = index.SeparaNome(quantidade, palavra);
		for(int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
	}
}
