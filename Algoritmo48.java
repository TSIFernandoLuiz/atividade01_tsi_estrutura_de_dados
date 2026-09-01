import java.util.Scanner;

public class Algoritmo48 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario minimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite a quantidade de quilowatts consumida: ");
        double quantidadeKwh = scanner.nextDouble();

        double precoKwh = salarioMinimo / 7 / 100;

        double valorPagar = precoKwh * quantidadeKwh;

        double valorComDesconto = valorPagar * 0.90;

        System.out.printf("Preco de cada kWh: R$ %.2f%n", precoKwh);
        System.out.printf("Valor a pagar: R$ %.2f%n", valorPagar);
        System.out.printf("Valor com desconto de 10%%: R$ %.2f%n",
                valorComDesconto);

        scanner.close();
    }
}
