package exCapDois;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class exUmD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdFuncionarios = 0;
		double soma = 0;
		String opcao;
		
		do {
			System.out.println("Informe o nome do funcionário: ");
			String nome = sc.next();
			qtdFuncionarios += 1;
			
			System.out.println("Informe o salário: ");
			double salario = sc.nextInt();
			soma += salario;
			
			System.out.println("Deseja continuar? s/n");
			 opcao = sc.next();
			
		} while(opcao.equals("s"));

		
		double media = soma / qtdFuncionarios;
		
		System.out.println("A quantidade de pessoas informadas foi: "+qtdFuncionarios +"e a media salaria é " + media );
	}

}
