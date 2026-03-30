import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();

        switch (op) {
            case 1 -> System.out.println("Opção 1");
            case 2 -> System.out.println("Opção 2");
            case 3 -> System.out.println("Opção 3");
            case 4 -> System.out.println("Sair");
            default -> System.out.println("Inválido");
        }

        System.out.println("Fim do programa!");
    }
}
