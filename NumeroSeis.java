package Vetor;

import java.util.Scanner;

public class NumeroSeis {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		Vetor index = new Vetor();
		int tam = 5;
		int vet[] = new int[tam];
		System.out.println("Informe os valores do vetor: ");
		for(int i = 0; i < tam; i++) {
			vet[i] = valor.nextInt();
		}
		System.out.println("A soma do vetor é: ");
		System.out.println(index.SomaVetor(vet));
		System.out.println("A multiplicação do vetor é: ");
		System.out.println(index.MultiplicaVetor(vet)); 
		System.out.println("O vetor é: ");
		System.out.println(index.MostraVetor(vet));
	}

}
