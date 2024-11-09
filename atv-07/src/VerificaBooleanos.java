import java.util.Scanner;

public class VerificaBooleanos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos verificar se os valores digitados são verdadeiros ou falsos!");
        System.out.println("Digite o primeiro valor booleano (true/false): ");
        boolean a = scanner.nextBoolean();
        System.out.println("Digite o segundo valor booleano (true/false): ");
        boolean b = scanner.nextBoolean();

        if (a && b) {
            System.out.println("Ambos são VERDADEIROS!");
        } else if (!a && !b) {
            System.out.println("Ambos são FALSOS!");
        } else {
            System.out.println("Um é VERDADEIRO e o outro é FALSO!");
        }
    }
}
