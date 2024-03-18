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

        int diasPorMes = 30;

        double consumoDiarioKwh = (potenciaWatts * horasPorDia) / 1000;

        double consumoMensalKwh = consumoDiarioKwh * diasPorMes;

        double valorPagoMensal = consumoMensalKwh * valorKwh;

        System.out.println("O equipamento consome aproximadamente " + consumoMensalKwh + " kWh por mês.");
        System.out.println("O valor pago mensal pelo consumo será de R$ " + valorPagoMensal);
    }
}
