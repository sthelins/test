package exCapDois;

import java.util.Scanner;

public class exDoisC {

	public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
		
		int[][] vetor = new int[30][24];
		
		int soma = 0;
		
		for(int l = 0; l < 30; l++ ) {
			for(int c = 0; c < 24; c++) {
				System.out.printf("Digite os valores [%d][%d]: ", l,c);
				vetor[l][c] = sc.nextInt();
			
			}
		}
		
		

	}
}
