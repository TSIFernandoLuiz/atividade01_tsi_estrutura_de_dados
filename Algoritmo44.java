import java.util.Scanner;

public class Algoritmo44 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o logaritmando: ");
        double numero = scanner.nextDouble();

        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();

        double logaritmo = Math.log(numero) / Math.log(base);

        System.out.println(
                "O logaritmo de " + numero +
                " na base " + base +
                " e: " + logaritmo
        );

        scanner.close();
    }
}
