import java.util.Scanner;

public class SomaMenorQueC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma;

        System.out.println("Digite um número inteiro para A: ");
        int a = sc.nextInt();
        System.out.println("Digite um número inteiro para B: ");
        int b = sc.nextInt();
        System.out.println("Digite um número inteiro para C: ");
        int c = sc.nextInt();

        soma = a + b;

        System.out.println("A soma de A e B é: " + soma);

        if (soma < c) {
            System.out.println("A soma de A e B é menor que C.");
        } else {
            System.out.println("A soma de A e B é maior que C.");
        }
    }
}
