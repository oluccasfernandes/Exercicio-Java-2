import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso atual (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura (em cm): ");
        double alturaCm = scanner.nextDouble();

        double alturaM = alturaCm / 100;

        // Calcular o IMC
        double imc = peso / (alturaM * alturaM);

        // Calcular o peso ideal e o peso ideal ajustado
        double pesoIdeal = 22 * alturaM * alturaM;
        double pesoIdealAjustado = 25 * alturaM * alturaM;

        // Exibir o IMC, peso ideal e peso ideal ajustado
        System.out.println("Seu IMC é: " + imc);
        System.out.println("Peso ideal: " + pesoIdeal + " kg");
        System.out.println("Peso ideal ajustado: " + pesoIdealAjustado + " kg");
    }
}
