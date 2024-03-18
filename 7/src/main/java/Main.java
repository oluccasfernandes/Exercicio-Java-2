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

        System.out.print("Digite o valor do metro quadrado da cerâmica escolhida (em reais): ");
        double valorMetroQuadrado = scanner.nextDouble();

        double areaArea = larguraArea * comprimentoArea;
        double areaCeramica = larguraCeramica * comprimentoCeramica;
        double quantidadeCeramica = Math.ceil(areaArea / areaCeramica);

        quantidadeCeramica *= 1.1;

        double valorTotal = quantidadeCeramica * valorMetroQuadrado;

        System.out.println("Quantidade de cerâmica necessária: " + quantidadeCeramica);
        System.out.println("Valor total a ser pago: R$ " + valorTotal);
    }
}
