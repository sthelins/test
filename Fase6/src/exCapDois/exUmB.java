package exCapDois;

import java.util.Scanner;

public class exUmB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número entre 0 e 12 para ver a tabuada: ");
		int numTabuada = sc.nextInt();
		
		if(numTabuada >= 0 && numTabuada <=12) {
			for(int i = 1; i <= 10; i++) {
				int multiplicacao = numTabuada * i;
				System.out.println(numTabuada + " x " + i+" = " + multiplicacao);
			}
		} else {
			System.out.println("Número fora do intervalo requisitado");
		}

	}

}
