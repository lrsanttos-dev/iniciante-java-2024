import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double tempF = sc.nextDouble();

        double tempC;

        tempC = (5 * (tempF - 32) / 9);

        System.out.println("A temperatura de " + tempF + "°F corresponde a " + tempC + "°C.");
    }
}
