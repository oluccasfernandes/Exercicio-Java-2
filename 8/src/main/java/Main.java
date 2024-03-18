import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo em MB: ");
        double tamanhoArquivoMB = scanner.nextDouble();

        System.out.print("Digite a velocidade do link em Mbps: ");
        double velocidadeLinkMbps = scanner.nextDouble();

        // Calcular o tempo necessário para o download em minutos
        double tempoTotalMinutos = (tamanhoArquivoMB / velocidadeLinkMbps) * 60;

        System.out.println("O tempo total necessário para o download é de: " + tempoTotalMinutos + " minutos");
    }
}
