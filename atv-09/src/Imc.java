import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos calcular seu IMC.");
        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double calculo = peso / (altura * altura);

        if (calculo <= 18.5) {
            System.out.println("Abaixo do peso!");
        } else if (calculo > 18.6 && calculo <= 24.9) {
            System.out.println("Peso ideal!");
        } else if (calculo > 25 && calculo <= 29.9) {
            System.out.println("Levemente acima do peso!");
        } else if (calculo > 30 && calculo <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (calculo > 35 && calculo <= 39.9) {
            System.out.println("Obesidade grau II (Severa)");
        } else {
            System.out.println("Obesidade grau III (Mórbida)");
        }
    }
}
