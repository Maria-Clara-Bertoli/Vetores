package Vetor;

public class Vetor {

	private float soma;
	private int par = 0;
	private int impar = 0;
	private int somaconsoante = 0;
	private int somavetor;
	private int multiplicavetor = 1;

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
	
	public String MostraConsoante(char vet[]) {
		StringBuilder saida = new StringBuilder();
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] != 'a' && vet[i] != 'e' && vet[i] != 'i' && vet[i] != 'o' && vet[i] != 'u') {
			saida.append(vet[i]);
			saida.append(", ");
			}
		}
		return saida.toString();
	}
	
	public String SomaConsoante(char vet[]) {
		StringBuilder saida = new StringBuilder();
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] != 'a' && vet[i] != 'e' && vet[i] != 'i' && vet[i] != 'o' && vet[i] != 'u') {
			somaconsoante += 1;
			}
		}
		saida.append(somaconsoante);
		return saida.toString();
	}
	
	public int SomaVetor(int vet[]) {
		for(int i = 0; i < vet.length; i++) {
			somavetor += vet[i];
		}
		return somavetor;
	}
	
	public int MultiplicaVetor(int vet[]) {
		for(int i = 0; i < vet.length; i++) {
			multiplicavetor = multiplicavetor * vet[i];
		}
		return multiplicavetor;
	}
	
	public String MostraVetor(int vet[]) {
		StringBuilder saida = new StringBuilder();
		for(int i = 0; i < vet.length; i++) {
			saida.append(vet[i]);
			saida.append(", ");
		}
		return saida.toString();
	}
}
