import java.util.Scanner;

public class cinco_num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();
            System.out.println("Você digitou: " + num);
        }

        sc.close();
    }
}