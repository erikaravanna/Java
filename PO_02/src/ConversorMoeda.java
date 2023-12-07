    import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação da moeda desejada
        System.out.print("Digite a moeda desejada (por exemplo, euros, reais): ");
        String moedaDestino = scanner.nextLine();

        // Solicitação da taxa de câmbio
        System.out.print("Digite a taxa de câmbio (por exemplo, 5,24 para converter dólares para reais): ");
        double taxaCambio = scanner.nextDouble();

        // Solicitação da quantidade em dólares
        System.out.print("Digite a quantidade em dólares: ");
        double quantidadeDolares = scanner.nextDouble();

        // Cálculo da conversão
        double valorConvertido = quantidadeDolares * taxaCambio;

        // Exibição do resultado com a moeda
        System.out.println("O valor convertido para " + moedaDestino + " é: " + valorConvertido);

        // Fechamento do scanner
        scanner.close();
    }
}

