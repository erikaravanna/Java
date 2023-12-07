package areaRetangulo;

import java.util.Scanner;

public class AreaRetangulo {
	
	void calculaAreaRetangulo(int largura, int altura){
		System.out.println(largura * altura);
	}
	
	public static void main(String[] args) {
		int largura, altura;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a largura do retangulo: ");
		largura = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Informe a altura do retangulo: ");
		altura = scanner.nextInt();
		scanner.nextLine();
		
		AreaRetangulo area = new AreaRetangulo();
		area.calculaAreaRetangulo(largura, altura);
		
		scanner.close();
	}
}
