import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe três valores inteiros para que sejam organizados de forma decrescente!");

        System.out.println("Digite o primeiro número inteiro: ");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int b = scanner.nextInt();
        System.out.println("Digite o terceiro número inteiro: ");
        int c = scanner.nextInt();

        int maior, medio, menor;

        if (a > b && a > c) {
            maior = a;
            if (b > c) {
                medio = b;
                menor = c;
            } else {
                medio = c;
                menor = b;
            }
        } else if (b > a && b > c) {
            maior = b;
            if (a > c) {
                medio = a;
                menor = c;
            } else {
                medio = c;
                menor = a;
            }
        } else {
            maior = c;
            if (a > b) {
                medio = a;
                menor = b;
            } else {
                medio = b;
                menor = a;
            }
        }

        System.out.println("Os valores digitados em ordem decrescente são: " + maior + ", " + medio + ", " + menor);

    }
}
