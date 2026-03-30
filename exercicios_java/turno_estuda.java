import java.util.Scanner;

public class turno_estuda_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o turno (M - Matutino, V - Vespertino, N - Noturno): ");
        char turno = sc.next().charAt(0);

        if (turno == 'M') {
            System.out.println("Bom Dia!");
        } else if (turno == 'V') {
            System.out.println("Boa Tarde!");
        } else if (turno == 'N') {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Valor Inválido!");
        }

        sc.close();
    }
}