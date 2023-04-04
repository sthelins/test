package exCapDois;

import java.util.Scanner;

public class exDoisA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[15];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o número; ");
			int entrada = sc.nextInt();
			vetor[i] = entrada;
		}
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

}
