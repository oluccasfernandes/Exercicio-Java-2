import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a potência do equipamento (em Watts): ");
        double potenciaWatts = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas que o equipamento fica ligado por dia: ");
        double horasPorDia = scanner.nextDouble();

        System.out.print("Digite o valor do kWh (em reais): ");
        double valorKwh = scanner.nextDouble();

        double consumoKwh = (potenciaWatts * horasPorDia) / 1000;

        double valorPago = consumoKwh * valorKwh;

        System.out.println("O equipamento consome " + consumoKwh + " kWh por dia.");
        System.out.println("O valor pago pelo consumo será de R$ " + valorPago);
    }
}
