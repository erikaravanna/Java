// Exceção personalizada para divisão por zero
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String mensagem) {
        super(mensagem);
    }
}

// Classe Calculadora com métodos para as operações
public class Calculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        try {
            // Exemplo de uso
            System.out.println("Soma: " + calculadora.somar(5, 3));
            System.out.println("Subtração: " + calculadora.subtrair(8, 2));
            System.out.println("Multiplicação: " + calculadora.multiplicar(4, 6));
            System.out.println("Divisão (int): " + calculadora.dividirInteiro(10, 2));
            System.out.println("Divisão (float): " + calculadora.dividirFloat(10, 3));
            // Tentativa de divisão por zero
            System.out.println("Divisão (float por zero): " + calculadora.dividirFloat(5, 0));
        } catch (DivisionByZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    // Métodos para as operações
    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para divisão de inteiros com tratamento de exceção
    public int dividirInteiro(int dividendo, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Divisão por zero não permitida.");
        }
        return dividendo / divisor;
    }

    // Método para divisão de floats com tratamento de exceção
    public float dividirFloat(float dividendo, float divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Divisão por zero não permitida.");
        }
        return dividendo / divisor;
    }
}
