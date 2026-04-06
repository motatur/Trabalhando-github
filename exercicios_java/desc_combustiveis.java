import java.util.Scanner;

public class desc_combustiveis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de litros: ");
        double litros = sc.nextDouble();

        System.out.print("Digite o tipo de combustível (A ou G): ");
        String tipo = sc.next();

        double precoLitro = 0;
        double desconto = 0;

        if (tipo.equalsIgnoreCase("A")) {
            precoLitro = 2.89;

            if (litros <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }

        } else if (tipo.equalsIgnoreCase("G")) {
            precoLitro = 4.95;

            if (litros <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }

        } else {
            System.out.println("Tipo inválido!");
            sc.close();
            return;
        }

        double total = litros * precoLitro;
        double valorFinal = total - (total * desconto);

        System.out.printf("Valor a pagar: R$ %.2f%n", valorFinal);

        sc.close();
    }
}