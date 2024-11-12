import java.util.Scanner;

public class MaiorDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Seu nome é " + nome + " e você é maior de idade!");
        } else {
            System.out.println("Seu nome é " + nome + " e você é menor de idade.");
        }
    }
}
