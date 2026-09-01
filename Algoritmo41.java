import java.util.Scanner;

public class Algoritmo41 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        double c = scanner.nextDouble();

        System.out.print("Digite o quarto numero: ");
        double d = scanner.nextDouble();

        double mediaPonderada =
                (a * 1 + b * 2 + c * 3 + d * 4) / 10;

        System.out.println("Media ponderada: " + mediaPonderada);

        scanner.close();
    }
}
