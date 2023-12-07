package temperatura;

import java.util.Scanner;

public class Temperatura {
	
	void converteCelsius(double temperatura) {
		System.out.println((temperatura - 32 * 5 / 9  ) + " Celsius");
	}
	
	void converteFahrenheit(double temperatura) {
		System.out.println(((temperatura * (9/5)) + 32) + " Fahrenheit");
	}

	public static void main(String[] args) {
		double temperatura;
		int escolha = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o valor da temperatura: ");
		temperatura = scanner.nextDouble();
		scanner.nextLine();
		
		do {
			System.out.println("Digite 1 para Celsius ou 2 para Fahrenheit: ");
			escolha = scanner.nextInt();
			scanner.nextLine();
			if (escolha != 1 && escolha != 2) {
				System.out.println("ERRO: Digite 1 ou 2 !!!");
			}
		} while (escolha != 1 && escolha != 2 );
		
		Temperatura converteTemperatura = new Temperatura();
		if(escolha == 1) {
			converteTemperatura.converteFahrenheit(temperatura);
		}else converteTemperatura.converteCelsius(temperatura);
		
		scanner.close();
	}
}
