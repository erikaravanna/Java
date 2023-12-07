package mediaPonderada;

import java.util.Scanner;

public class MediaPonderada {
	void calculaMedia(float nota01, float nota02, float nota03, float peso01, float peso02, float peso03){
		System.out.println("Media: " + (nota01 * peso01 + nota02 * peso02 + nota03 * peso03 )/ (peso01 + peso02 + peso03));
		//nota01 * peso01 + nota02 * peso02 + nota03 * peso03 / peso01 + peso02 + peso03;
	}
	
	
	public static void main(String[] args) {
		float nota01, nota02, nota03, peso01, peso02, peso03;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota: ");
		nota01 = scanner.nextFloat();
		scanner.nextLine();
		System.out.println("Qual o peso desta nota: ");
		peso01 = scanner.nextFloat();
		scanner.nextLine();
		
		System.out.println("Insira a segunda nota: ");
		nota02 = scanner.nextFloat();
		scanner.nextLine();
		System.out.println("Qual o peso desta nota: ");
		peso02 = scanner.nextFloat();
		scanner.nextLine();
		
		System.out.println("Insira a terceira nota: ");
		nota03 = scanner.nextFloat();
		scanner.nextLine();
		System.out.println("Qual o peso desta nota: ");
		peso03 = scanner.nextFloat();
		scanner.nextLine();
		
		MediaPonderada mediaPonderada = new MediaPonderada();
		mediaPonderada.calculaMedia(nota01, nota02, nota03, peso01, peso02, peso03);		
		scanner.close();
	}
}
