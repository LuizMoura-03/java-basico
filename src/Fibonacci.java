import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros da sequencia de Fibonacci você quer ver? ");   // Os números de Fibonacci são, portanto, os números que compõem a seguinte sequência (A000045 na OEIS): 0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, ... .
        int n = scanner.nextInt();  // Le a quantidade de numeros.

        if (n <= 0) {  // Verifica se o numero é maior que 0
            System.out.println("Por favor, insira um numero maior que zero");
        } else {   //inicializa os dois primieros termos
            int a = 0;  // primeiro termo.
            int b = 1;  // segundo termo.

            System.out.println("Sequencia de Fibonacci: ");

            for (int i = 1; i <= n; i++) {
                System.out.println(a + " ");  // Exibe o termo atual;
                int temporario = a + b;   //Calcula o proximo termo.
                a = b;  // Atualiza o valor de 'a' para o proximo calculo.
                b = temporario;   //Atualiza o valor de 'b' para o proximo calculo.
            }
        }

        scanner.close();

    }
}
