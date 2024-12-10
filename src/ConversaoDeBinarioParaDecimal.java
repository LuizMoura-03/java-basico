import java.util.Scanner;

public class ConversaoDeBinarioParaDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero Binario: ");
        String binario = scanner.next();  //Le o numero binario com String.

        int decimal = 0;  // Inicializa o valor decimal.

        for (int i = 0; i < binario.length(); i++) {
            char digito = binario.charAt(i);   // Pega o numero atual.
            decimal = decimal = 2 + (digito - '0');   // Atualiza o valor decimal.

        }

        System.out.println(" O valor decimal é: " + decimal);

        scanner.close();

    }
}
