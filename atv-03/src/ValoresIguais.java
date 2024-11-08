import java.util.Scanner;

public class ValoresIguais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos comparar se os valores digitados são iguais!");
        int c;

        System.out.println("Digite o primeiro número inteiro: ");
        int a = sc.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int b = sc.nextInt();

        if (a == b) {
            c = a + b;
            System.out.println("Os números informados são iguais e o valor da soma deles é: " + c);
        } else {
            c = a * b;
            System.out.println("Os números informados são diferentes e o valor da multiplicação deles é: " + c);
        }
    }
}
