package somaInteiros;

import java.util.Scanner;

public class SomaInteiros {
	public static void main(String[] args) {
		int x, y;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira um numero inteiro: ");
		x = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Insira outro numero inteiro: ");
		y = scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		System.out.println(x + "+" + y + "=" + (x + y));
		
	}
}
