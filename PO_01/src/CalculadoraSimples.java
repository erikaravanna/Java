import java.util.Scanner;

public class CalculadoraSimples {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o primeiro número:");
	        double num1 = scanner.nextDouble();

	        System.out.println("Digite o segundo número:");
	        double num2 = scanner.nextDouble();

	        System.out.println("Escolha a operação (A-adição, S-subtração, M-multiplicação, D-divisão):");
	        String operacao = scanner.next();

	        double resultado;
	        switch (operacao) {
	            case "A":
	                resultado = num1 + num2;
	                break;
	            case "S":
	                resultado = num1 - num2;
	                break;
	            case "M":
	                resultado = num1 * num2;
	                break;
	            case "D":
	                resultado = num1 / num2;
	                break;
	            default:
	                System.out.println("Operação inválida!");
	                return;
	        }

	        System.out.println("O resultado é: " + resultado);
	    }
	}
