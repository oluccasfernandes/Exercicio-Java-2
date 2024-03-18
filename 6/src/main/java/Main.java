import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura da área a ser revestida (em metros): ");
        double larguraArea = scanner.nextDouble();

        System.out.print("Digite o comprimento da área a ser revestida (em metros): ");
        double comprimentoArea = scanner.nextDouble();

        System.out.print("Digite a largura da cerâmica escolhida (em metros): ");
        double larguraCeramica = scanner.nextDouble();

        System.out.print("Digite o comprimento da cerâmica escolhida (em metros): ");
        double comprimentoCeramica = scanner.nextDouble();

        // Calcular a quantidade de cerâmica necessária
        double areaArea = larguraArea * comprimentoArea;
        double areaCeramica = larguraCeramica * comprimentoCeramica;
        double quantidadeCeramica = Math.ceil(areaArea / areaCeramica);

        // Acrescentar dez por cento para o acabamento
        quantidadeCeramica *= 1.1;

        System.out.println("Quantidade de cerâmica necessária: " + quantidadeCeramica);
    }
}
