import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criando scanner para entrada

        System.out.println("Digite um numero: "); // Solicitando numero ao usuario.
        int n = scanner.nextInt();  // lendo o numeo fornecido pelo usuario.

        int fatorial = 1;
        int i = n;

        while (i > 1) {  // Enquanto i for maior que 1, continua a multiplicar.
            fatorial *= i; // Multiplica o fatorial pelo valçor atuade i.
            i--;  //Decrementa o valor de i.
        }

        System.out.println("Fatorial de " + n + " : " +fatorial); //Exibindo o resultado

        scanner.close();

    }
}
