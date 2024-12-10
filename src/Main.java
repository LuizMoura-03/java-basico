import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Soma de Numeros: ");

        System.out.println("Digite um numero: ");
        int n = scanner.nextInt(); // Le o número fornecido pelo usuario.

        int soma = 0; //Iniciando a varivel com 0 para começar a contagem.

        for (int i = 1; i <= n; i++) {
            soma += i;  //Adiciona o valor atual de  i a varivel soma.
        }

        System.out.println("Soma de dois numeros de 1 até " + n + " : " + soma); //exibe o resultado

        scanner.close();


    }
}