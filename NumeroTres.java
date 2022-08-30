package Vetor;

import java.util.Scanner;

public class NumeroTres {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		Vetor index = new Vetor();
		
		final int tam = 4;
		float []vet =  new float [tam];
		System.out.println("Informe as quatro notas do aluno: ");
		for(int i = 0; i < tam; i++) {
			vet[i] = valor.nextFloat();
		}
		System.out.println("A média é: " + index.Media(vet)); 
	}

}
