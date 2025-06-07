import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        try {
            validarNumero(numero);
            System.out.println("Número válido: " + numero);
        } catch (NumeroNegativoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }

    public static void validarNumero(int numero) {
        if (numero < 0) {
            throw new NumeroNegativoException("Número negativo não permitido: " + numero);
        }
    }
}
