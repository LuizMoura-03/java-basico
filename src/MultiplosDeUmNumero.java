import java.util.Scanner;

public class MultiplosDeUmNumero {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Digite um numero n: ");
        int n = scanner.nextInt();

        System.out.println("Digite o numero m: ");
        int m = scanner.nextInt();

        System.out.println("Multplos de " + n + " ate " + m + " : ");

        for (int i = n; i <= m; i += n) {
            System.out.println(i + " "); // Imprime o multiplo.
        }

        scanner.close();

    }
}
