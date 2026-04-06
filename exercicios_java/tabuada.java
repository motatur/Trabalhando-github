import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número da tabuada: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num + " = " + (i * num));
        }

        sc.close();
    }
}