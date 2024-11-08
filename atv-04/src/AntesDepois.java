import java.util.Scanner;

public class AntesDepois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int a = sc.nextInt();

        System.out.println("O número que você digitou foi: " + a + ".");
        System.out.println("O antecessor de " + a + " é: " + (a - 1) + ".");
        System.out.println("O sucessor de " + a + " é: " + (a + 1) + ".");
    }
}
