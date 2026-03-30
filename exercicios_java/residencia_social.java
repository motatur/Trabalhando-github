import java.util.Scanner;

public class residencia_social {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o consumo de água (m3): ");
        int consumo = sc.nextInt();

        double valor = 0.0;

        if (consumo <= 10) {
            valor = 7.59;
        } else if (consumo <= 20) {
            valor = consumo * 1.31;
        } else if (consumo <= 30) {
            valor = consumo * 4.64;
        } else if (consumo <= 50) {
            valor = consumo * 6.62;
        } else {
            valor = consumo * 7.31;
        }

        System.out.printf("Valor da conta: R$ %.2f\n", valor);

        sc.close();
    }
}