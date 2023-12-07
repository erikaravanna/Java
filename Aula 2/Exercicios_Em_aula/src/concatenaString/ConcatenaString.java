package concatenaString;

import java.util.Scanner;

public class ConcatenaString {
	
	public static void main(String[] args) {
		String texto01, texto02, texto03, concatena;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um texto: ");
		texto01 = scanner.nextLine();
		System.out.println("Digite um texto: ");
		texto02 = scanner.nextLine();
		System.out.println("Digite um texto: ");
		texto03 = scanner.nextLine();
		
		concatena = texto01 + " " + texto02 + " " + texto03;
		System.out.println(concatena);
		
		scanner.close();
		
	}
}
