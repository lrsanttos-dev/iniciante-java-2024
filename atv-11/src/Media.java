import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos verificar a média dos alunos!");
        System.out.println("Digite o nome do aluno: ");
        String aluno = scanner.nextLine();

        System.out.println("Digite a 1º nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a 2º nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a 3º nota: ");
        double nota3 = scanner.nextDouble();
        System.out.println("Digite a 4º nota: ");
        double nota4 = scanner.nextDouble();

        double media;
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println(String.format("O aluno " + aluno + " foi aprovado com média: %.2f", media));
        } else {
            System.out.println(String.format("O aluno " + aluno + " foi reprovado com média: %.2f", media));
        }
    }
}
