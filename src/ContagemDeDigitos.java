import java.util.Scanner;

public class ContagemDeDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        int contador = 0;

        while (numero != 0) {
            numero /=10; // divide popr 10.
            contador++; // Incrementa o contador
        }

        // Exibe o total de digitos.
        System.out.println("Quantidade de digitos: " +contador);

        scanner.close();
    }
}
