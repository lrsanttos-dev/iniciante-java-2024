import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarios;

        System.out.println("Vamos descobrir quantos salários mínimos um funcionário recebe!");
        System.out.println("Digite o valor do salário mínimo atual: ");
        double salarioMinimo = sc.nextDouble();
        System.out.println("Digite o valor do salário do funcionário: ");
        double salarioFuncionario = sc.nextDouble();

        salarios = salarioFuncionario / salarioMinimo;
        System.out.println("O funcionário recebe o equivalente a " + String.format("%.2f", salarios) + " salário(os) mínimo(os).");
    }
}
