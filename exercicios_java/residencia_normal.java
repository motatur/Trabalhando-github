import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o consumo de água (m³): ");
        double consumo = sc.nextDouble();

        double valor;

        if (consumo <= 10) {
            valor = 22.38;
        } else if (consumo <= 20) {
            valor = consumo * 3.50;
        } else if (consumo <= 50) {
            valor = consumo * 8.75;
        } else {
            valor = consumo * 9.64;
        }

        System.out.println("Valor da conta: R$ " + valor);

        sc.close();
    }
}