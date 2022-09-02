package Vetor;

import java.util.Scanner;

public class NumeroCinco {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		Vetor index = new Vetor();
		final int tam = 10;
		char []vet =  new char [tam];
		System.out.println("Informe os caracteres do vetor: ");
		for(int i = 0; i < tam; i++) {
			vet[i] = valor.next().charAt(0);
		}
		System.out.println("A soma das consoantes é: ");
		System.out.println(index.SomaConsoante(vet));
		
		System.out.println("As consoantes são: ");
		System.out.println(index.MostraConsoante(vet));
		
	}

}
