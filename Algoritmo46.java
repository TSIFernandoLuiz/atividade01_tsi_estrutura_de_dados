import java.util.Scanner;

public class Algoritmo46 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        double novoSaldo = saldo * 1.01;

        System.out.println("Novo saldo: " + novoSaldo);

        scanner.close();
    }
}
