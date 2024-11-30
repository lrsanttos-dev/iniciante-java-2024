import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite qual tabuada você gostaria de calcular: ");
        int tabuada = scanner.nextInt();

        System.out.println("-----");
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada * i);
        }
        System.out.println("-----");
    }
}
