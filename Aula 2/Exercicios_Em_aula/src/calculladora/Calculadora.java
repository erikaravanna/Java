package calculladora;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		float num01, num02;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		num01 = scanner.nextFloat();
		
		System.out.println("Insira outro valor: ");
		num02 = scanner.nextFloat();
		
		int condicao;
		do {
			System.out.println("1. Adicao");
			System.out.println("2. Subtracao");
			System.out.println("3. Multiplicacao");
			System.out.println("4. Divisao");
			System.out.println("0. Sair da Calculadora");
			
			condicao = scanner.nextInt();
			
			switch (condicao) {
			case 1: 
				System.out.println(num01 + "+" + num02 + " = " + (num01 + num02));
				break;
			case 2: 
				System.out.println(num01 + "-" + num02 + " = " + (num01 - num02));
				break;
			case 3:
				System.out.println(num01 + "*" + num02 + " = " + (num01 * num02));
				break;
			case 4:
				System.out.println(num01 + "/" + num02 + " = " + (num01 / num02));
				break;
			case 0:
				break;
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + condicao);
			}
			
		} while (condicao != 0);
	}
}
