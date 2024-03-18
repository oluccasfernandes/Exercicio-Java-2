import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso da pessoa (em kg): ");
        double peso = scanner.nextDouble();

        double quantidadeAguaLitros = peso * 35 / 1000; // Convertendo ml para litros (1L = 1000ml)

        System.out.println("A quantidade recomendada de água por dia é de: " + quantidadeAguaLitros + " litros");
    }
}
