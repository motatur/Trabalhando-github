import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int op = sc.nextInt();

        switch (op) {
            case 1 -> System.out.println(a + b);
            case 2 -> System.out.println(a - b);
            case 3 -> System.out.println(a * b);
            case 4 -> System.out.println(a / b);
            case 5 -> System.out.println(Math.pow(a, b));
            case 6 -> System.out.println(Math.sqrt(a));
            case 7 -> System.out.println(a % 2 == 0 ? "Par" : "Ímpar");
            case 8 -> System.out.println(a % 2 != 0 ? "Ímpar" : "Par");
        }
    }
}
