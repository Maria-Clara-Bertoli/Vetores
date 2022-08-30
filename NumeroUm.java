package Vetor;

import java.util.Scanner;

public class NumeroUm {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		Vetor index = new Vetor();
		
		final int tam = 5;
		int []vet =  new int [tam];
		int []vet2 =  new int [tam];
		System.out.println("Informe cinco números inteiros: ");
		for(int i = 0; i < tam; i++) {
			vet[i] = valor.nextInt();
		}
		vet2 = index.VetorInteiro(vet);
		for(int i = 0; i < tam; i++) {
			System.out.println(vet2[i]);
		}
	}

}
