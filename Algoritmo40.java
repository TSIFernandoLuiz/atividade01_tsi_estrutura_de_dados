import java.util.Scanner;

public class Algoritmo40 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.print("Digite o divisor: ");
        int divisor = scanner.nextInt();

        int quociente = dividendo / divisor;
        int resto = dividendo % divisor;

        System.out.println();
        System.out.println("Dividendo: " + dividendo);
        System.out.println("Divisor: " + divisor);
        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);

        scanner.close();
    }
}
