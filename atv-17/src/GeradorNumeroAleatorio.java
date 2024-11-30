import java.util.Random;

public class GeradorNumeroAleatorio {
    public static void main(String[] args) {
        Random random = new Random();

        int numeroAleatorio = random.nextInt(101);
        System.out.println("O número aleatório de 0 a 100 é o: " + numeroAleatorio);
    }
}
