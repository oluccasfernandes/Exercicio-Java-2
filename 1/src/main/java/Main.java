import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o valor da hora
        System.out.print("Digite a hora no formato HH:MM: ");
        String horaStr = scanner.nextLine();

        // Dividir a hora em partes separadas (horas e minutos)
        String[] partes = horaStr.split(":");
        int hora = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);

        // Calcular quantos minutos se passaram desde o início do dia
        int minutosDesdeInicioDoDia = hora * 60 + minutos;

        // Mostrar o resultado
        System.out.println("Passaram-se " + minutosDesdeInicioDoDia + " minutos desde o início do dia.");
    }
}
