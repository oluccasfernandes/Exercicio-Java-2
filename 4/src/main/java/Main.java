import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor conhecido: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor conhecido: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor conhecido: ");
        double valor3 = scanner.nextDouble();

        System.out.print("Qual valor você deseja calcular? ");
        String valorDesconhecido = scanner.next();

        // Calcular o valor desconhecido usando a regra de três simples
        double resultado = 0.0;
        if (valorDesconhecido.equalsIgnoreCase("A")) {
            resultado = (valor3 * valor1) / valor2;
        } else if (valorDesconhecido.equalsIgnoreCase("B")) {
            resultado = (valor2 * valor1) / valor3;
        } else if (valorDesconhecido.equalsIgnoreCase("C")) {
            resultado = (valor2 * valor3) / valor1;
        } else {
            System.out.println("Valor desconhecido inválido.");
            return;
        }

        System.out.println("O valor de " + valorDesconhecido.toUpperCase() + " é: " + resultado);
    }
}
