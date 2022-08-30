package Vetor;

public class Vetor {

	private float soma;
	private int par = 0;
	private int impar = 0;

	public int[] VetorInteiro(int[] vet) {
		return vet;
	}

	public void OrdemInversa(float[] vet, int tam) {
		tam = tam - 1;
		while (tam >= 0) {
			System.out.print(" - " + vet[tam]);
			tam = tam - 1;
		}
	}

	public float Media(float[] vet) {
		for (int i = 0; i < 4; i++) {
			soma += vet[i];
		}
		soma = soma / 4;
		return soma;
	}

	public void ParImpar(int[] vet) {
		int[] vetimpar = new int[6];
		int[] vetpar = new int[6];
		for (int i = 0; i < 5; i++) {
			if (vet[i] % 2 == 0) {
				par += 1;
				vetpar[par] = vet[i];
			} else {
				impar += 1;
				vetimpar[impar] = vet[i];
			}
		}
		System.out.println("VETOR MISTURADO");
		for (int i = 0; i < 5; i++) {
			System.out.print(" - " + vet[i]);
		}
		System.out.println();
		System.out.println("VETOR PAR");
		for (int i = 0; i < 6; i++) {
			if (vetpar[i] != 0) {
				System.out.print(" - " + vetpar[i]);
			}
		}
		System.out.println();
		System.out.println("VETOR ÍMPAR");
		for (int i = 0; i < 6; i++) {
			if (vetimpar[i] != 0) {
				System.out.print(" - " + vetimpar[i]);
			}
		}
	}
}
