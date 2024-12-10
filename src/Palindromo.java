import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt(); //le numero.

        int original = numero; // Armazena numero original.
        int invertido = 0;

        while (numero != 0) {  // Inverte o numero.
            invertido = invertido * 10 + numero % 10;   // Pega o ultimo numero e o adiciona.
            numero /= 10;   // remove o ultimo digito.

        }

        boolean ePalindromo = (original == invertido);  // Comparando o numero original com o invertido.

        System.out.println("O numero " + original + " é Palindromo? " + ePalindromo);

        scanner.close();

    }
}
