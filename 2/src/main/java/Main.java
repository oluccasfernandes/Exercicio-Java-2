import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o preço da gasolina
        System.out.print("Digite o preço da gasolina: R$ ");
        double precoGasolina = scanner.nextDouble();

        // Ler o preço do etanol
        System.out.print("Digite o preço do etanol: R$ ");
        double precoEtanol = scanner.nextDouble();

        // Calcular o preço relativo do etanol em relação à gasolina
        double precoRelativoEtanol = precoEtanol / precoGasolina;

        // Verificar se vale a pena abastecer com etanol
        if (precoRelativoEtanol < 0.7) {
            System.out.println("É mais vantajoso abastecer com etanol.");
        } else {
            System.out.println("É mais vantajoso abastecer com gasolina.");
        }
    }
}
