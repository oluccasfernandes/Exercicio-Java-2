import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler os valores dos catetos
        System.out.print("Digite o valor do cateto a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor do cateto b: ");
        double b = scanner.nextDouble();

        // Calcular a hipotenusa usando o teorema de Pitágoras
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // Exibir o resultado
        System.out.println("O valor da hipotenusa (c) é: " + c);
    }
}
