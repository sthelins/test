package exCapDois;

import java.util.Scanner;

public class exDoisB {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[24];
		
		int soma = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite a temperatura: ");
			int entrada = sc.nextInt();
			soma += entrada;
		}
		
		double media = soma / vetor.length;
		System.out.println("A média foi: " + media);

	}

}
