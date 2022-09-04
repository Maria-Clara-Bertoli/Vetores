package Vetor;

import java.util.Scanner;

public class NumeroOito {

	public static void main(String[] args) {
	
		Scanner valor = new Scanner(System.in);
		Vetor index = new Vetor();
		
		int vet[] = new int[5];
		int vet2[] = new int[5];
		int vet3[] = new int[10];
		
		System.out.println("Informe os valores do primeiro vetor: ");
		for(int i = 0; i < vet.length; i++) {
			vet[i] = valor.nextInt();
		}
		System.out.println("Informe os valores do segundo vetor: ");
		for(int i = 0; i < vet.length; i++) {
			vet2[i] = valor.nextInt();
		}
		vet3 = index.JuntaVetor(vet, vet2);
		for(int i = 0; i < vet3.length; i++) {
			System.out.print(vet3[i] + ", ");
		}
	}
}
