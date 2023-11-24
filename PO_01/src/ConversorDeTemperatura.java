import java.util.Scanner;

public class ConversorDeTemperatura {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite a temperatura:");
	        double temperatura = scanner.nextDouble();

	        System.out.println("Digite a unidade de origem (Celsius ou Fahrenheit):");
	        String unidadeOrigem = scanner.next();

	        double resultado;
	        if (unidadeOrigem.equalsIgnoreCase("Celsius")) {
	            resultado = (temperatura * 9/5) + 32;
	            System.out.println("A temperatura em Fahrenheit é: " + resultado);
	        } else if (unidadeOrigem.equalsIgnoreCase("Fahrenheit")) {
	            resultado = (temperatura - 32) * 5/9;
	            System.out.println("A temperatura em Celsius é: " + resultado);
	        } else {
	            System.out.println("Unidade de origem inválida!");
	        }
	    }
	}