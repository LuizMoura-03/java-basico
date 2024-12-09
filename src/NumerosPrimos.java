import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        boolean primo = true; // define que o numero é primo.

        if (numero < 2) {
            primo = false;  // numero menor que 2 não são primos.
        } else {
            for (int i = 2; i <= numero / 2; i++) {  // verifica diviosres.
                if (numero % i == 0) {  // Se o número for divisivel não é primo.
                    primo = false;

                }
            }
        }

        System.out.println("O numero " + numero + " é primo? " + primo);

        scanner.close();

    }
}
