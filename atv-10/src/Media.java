import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos calcular a média semestral de um aluno!");

        double nota1, nota2, nota3, media;

        System.out.println("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;
        System.out.println(String.format("A média do aluno informado é de: %.2f", media));
    }
}
