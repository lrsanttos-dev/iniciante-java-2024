import java.util.Scanner;

public class Reajuste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Vamos reajustar um valor conforme a regra de negócio (5%).");
        System.out.println("Digite o valor para sofrer o reajuste: ");
        double valor = sc.nextDouble();

        double reajuste = valor * 0.05;
        double valorFinal = valor + reajuste;

        System.out.println("O valor " + valor + " foi reajustado para " + valorFinal + ".");
    }
}
