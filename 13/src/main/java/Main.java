import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numerador e o denominador da primeira fração:");
        int numerador1 = scanner.nextInt();
        int denominador1 = scanner.nextInt();

        System.out.println("Digite o numerador e o denominador da segunda fração:");
        int numerador2 = scanner.nextInt();
        int denominador2 = scanner.nextInt();

        // Calcular o denominador comum
        int denominadorComum = denominador1 * denominador2;

        // Calcular os novos numeradores
        int novoNumerador1 = numerador1 * denominador2;
        int novoNumerador2 = numerador2 * denominador1;

        // Calcular a soma dos numeradores
     
        System.out.println("A soma das frações é: " + somaNumeradores + "/" + denominadorComum);
    }
}
