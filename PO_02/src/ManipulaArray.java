import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ManipulaArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Método para criar array lido do usuário
        int[] arrayUsuario = criarArrayDoUsuario(scanner);

        // Método para criar array aleatório
        int[] arrayAleatorio = criarArrayAleatorio(5);  // Você pode ajustar o tamanho do array conforme necessário

        // Exibindo os arrays
        System.out.println("Array do usuário: " + Arrays.toString(arrayUsuario));
        System.out.println("Array aleatório: " + Arrays.toString(arrayAleatorio));

        // Calculando a soma dos elementos
        int somaUsuario = calcularSoma(arrayUsuario);
        int somaAleatorio = calcularSoma(arrayAleatorio);

        System.out.println("Soma do array do usuário: " + somaUsuario);
        System.out.println("Soma do array aleatório: " + somaAleatorio);

        // Encontrando o maior e o menor valor
        int maiorUsuario = encontrarMaiorValor(arrayUsuario);
        int menorUsuario = encontrarMenorValor(arrayUsuario);

        int maiorAleatorio = encontrarMaiorValor(arrayAleatorio);
        int menorAleatorio = encontrarMenorValor(arrayAleatorio);

        System.out.println("Maior valor do array do usuário: " + maiorUsuario);
        System.out.println("Menor valor do array do usuário: " + menorUsuario);

        System.out.println("Maior valor do array aleatório: " + maiorAleatorio);
        System.out.println("Menor valor do array aleatório: " + menorAleatorio);

        // Fechamento do scanner
        scanner.close();
    }

    // Método para criar array lido do usuário
    public static int[] criarArrayDoUsuario(Scanner scanner) {
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    // Método para criar array aleatório
    public static int[] criarArrayAleatorio(int tamanho) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(100);  // Números aleatórios até 99, você pode ajustar conforme necessário
        }

        return array;
    }

    // Método para calcular a soma dos elementos do array
    public static int calcularSoma(int[] array) {
        int soma = 0;
        for (int elemento : array) {
            soma += elemento;
        }
        return soma;
    }

    // Método para encontrar o maior valor no array
    public static int encontrarMaiorValor(int[] array) {
        int maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }

    // Método para encontrar o menor valor no array
    public static int encontrarMenorValor(int[] array) {
        int menor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }
}
