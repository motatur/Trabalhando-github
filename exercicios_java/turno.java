import java.util.Scanner;

public class turno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.next();

        switch (t) {
            case "M" -> System.out.println("Bom dia!");
            case "V" -> System.out.println("Boa tarde!");
            case "N" -> System.out.println("Boa noite!");
            default -> System.out.println("Inválido");
        }
    }
}
