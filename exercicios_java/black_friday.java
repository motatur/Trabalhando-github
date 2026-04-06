import java.util.Scanner;

public class black_friday {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valor = sc.nextDouble();

        System.out.println("1. À vista (em espécie)");
        System.out.println("2. Cartão de débito");
        System.out.println("3. Cartão de crédito");
        System.out.println("4. PIX");
        System.out.print("Escolha a forma de pagamento: ");
        int opcao = sc.nextInt();

        double desconto = 0;
        boolean opcaoValida = true;

        switch (opcao) {
            case 1:
                desconto = valor * 0.10;
                break;
            case 2:
                desconto = valor * 0.05;
                break;
            case 3:
                desconto = valor * 0.03;
                break;
            case 4:
                desconto = valor * 0.075;
                break;
            default:
                System.out.println("Opção inválida!");
                opcaoValida = false;
        }

        if (opcaoValida) {
            double valorFinal = valor - desconto;
            System.out.printf("Valor final: R$ %.2f%n", valorFinal);
        }

        sc.close();
    }
}