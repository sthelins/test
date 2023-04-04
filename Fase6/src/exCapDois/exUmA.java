package exCapDois;

import java.util.Scanner;

public class exUmA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 20 números inteiros para soma-los");
		int soma = 0;
		
		for(int i = 1; i <= 20; i++) {
			System.out.println("Digite o número " + i  + "°: ");
			int entrada = sc.nextInt();
			soma += entrada;
		}
		
		System.out.println("A soma foi: " + soma);

	}

}
