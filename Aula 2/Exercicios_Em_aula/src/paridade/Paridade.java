package paridade;

import java.util.Scanner;

public class Paridade {
	
	void parImpar(int num) {
		
		if(num % 2 == 0) {
			System.out.println("Par");
		}else System.out.println("Impar");
	}
	
	public static void main(String[] args) {
		int numero;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira um numero inteiro: ");
		numero = scanner.nextInt();
		
		Paridade paridade = new Paridade();
		paridade.parImpar(numero);
		
		scanner.close();
	}
}
