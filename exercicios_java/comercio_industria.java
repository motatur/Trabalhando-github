import java.util.Scanner;

public class comercio_industria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o consumo de água (m3): ");
        int consumo = sc.nextInt();

        double valor = 0.0;

        if (consumo <= 10) {
            valor = 44.95;
        } else if (consumo <= 20) {
            valor = consumo * 8.75;
        } else if (consumo <= 50) {
            valor = consumo * 16.76;
        } else {
            valor = consumo * 17.46;
        }

        System.out.printf("Valor da conta: R$ %.2f\n", valor);

        sc.close();
    }
}