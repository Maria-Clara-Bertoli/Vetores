package Vetor;

import java.util.Scanner;

public class NumeroQuatro {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		Vetor index = new Vetor();
		
		final int tam = 5;
		int []vet =  new int [tam];
		System.out.println("Informe os valores do vetor: ");
		for(int i = 0; i < tam; i++) {
			vet[i] = valor.nextInt();
		}
		index.ParImpar(vet);
	}

}
