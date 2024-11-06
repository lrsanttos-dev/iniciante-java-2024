import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro para descobrir se ele é PAR ou ÍMPAR: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("O número informado é PAR!");
        }else{
            System.out.println("O número é ÍMPAR!");
        }
    }
}
