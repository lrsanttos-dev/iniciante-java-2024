import java.util.Scanner;

public class TrocaValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro para A: ");
        int a = scanner.nextInt();
        System.out.println("Digite um valor inteiro para B: ");
        int b = scanner.nextInt();

        int temporario;

        temporario = a;
        a = b;
        b = temporario;

        System.out.println("O valor de A é: " + a);
        System.out.println("O valor de B é: " + b);
    }
}
