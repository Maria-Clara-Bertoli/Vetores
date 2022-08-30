package Vetor;

import java.util.Scanner;

public class NumeroDois {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		Vetor index = new Vetor();
		
		final int tam = 10;
		System.out.println("Informe dez números reais: ");
		float []vet =  new float [tam];
		for(int i = 0; i < tam; i++) {
			vet[i] = valor.nextInt();
		}
		index.OrdemInversa(vet, tam);
	}

}
