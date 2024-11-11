import java.util.Scanner;

public class PrecoDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double produto = scanner.nextDouble();

        System.out.println("Qual a forma de pagamento: ");
        System.out.println("------------");
        System.out.println("1 - À vista em dinheiro ou Pix.");
        System.out.println("2 - À vista no cartão de crédito.");
        System.out.println("3 - Parcelado em até 2x.");
        System.out.println("4 - Parcelado de 3 a 10 vezes.");
        System.out.println("------------");


        int pagamento = scanner.nextInt();
        double desconto, juros, valorFinal;

        switch (pagamento) {
            case 1:
                desconto = produto * 0.15;
                valorFinal = produto - desconto;
                System.out.println(String.format("O valor a ser pago com desconto de 15%% é de: %.2f", valorFinal));
                break;
            case 2:
                desconto = produto * 0.10;
                valorFinal = produto - desconto;
                System.out.println(String.format("O valor a ser pago com desconto de 10%% é de: %.2f", valorFinal));
                break;
            case 3:
                valorFinal = produto;
                System.out.println(String.format("O valor a ser pago é de: %.2f", valorFinal));
                break;
            case 4:
                juros = produto * 0.10;
                valorFinal = produto + juros;
                System.out.println(String.format("O valor a ser pago com juros de 10%% é de: %.2f", valorFinal));
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
