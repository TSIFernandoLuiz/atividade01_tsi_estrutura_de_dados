import java.util.Scanner;

public class Algoritmo26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data no formato DDMMAA: ");
        int data = scanner.nextInt();

        int dia = data / 10000;
        int mes = (data % 10000) / 100;
        int ano = data % 100;

        int novaData = mes * 10000 + dia * 100 + ano;

        System.out.println("DIA: " + dia);
        System.out.println("MES: " + mes);
        System.out.println("ANO: " + ano);

        System.out.printf("DATA NO FORMATO MMDDAA: %06d%n", novaData);

        scanner.close();
    }
}
