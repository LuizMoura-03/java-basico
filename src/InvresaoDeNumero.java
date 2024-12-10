import java.util.Scanner;

public class InvresaoDeNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        int invertido = 0;

        while (numero != 0) {
            invertido = invertido * 10;   // pega o ultimo digito.
            numero /= 10;  //Remove o ultimo digito

        }

        System.out.println("Numero invrertido: " + invertido);

        scanner.close();

    }
}
