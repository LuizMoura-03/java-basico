import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = scanner.nextInt();  // Le a base.

        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt(); // le o expoente.

        int resultado = 1; // começa com 1, pos qualquer numero elevado a 0 é 1.


        for (int i =1; i <= expoente; i++) {  //loop for para multiplicar a base pelo numero de vezes do expoente.
            resultado *= base;  //Multiplica o resultado pela base.
        }

        System.out.println("resultado: " + resultado); //Exibindo resultado.

        scanner.close();
    }
}
