import java.util.Scanner;

public class dois_logins {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o usuário: ");
        String usuario = sc.nextLine();

        System.out.print("Digite a senha: ");
        int senha = sc.nextInt();

        if ((usuario.equals("atila") && senha == 12345) ||
            (usuario.equals("olivi") && senha == 54321)) {

            System.out.println("Seja bem vindo!");

        } else {
            System.out.println("Usuário e senha não conferem");
        }

        sc.close();
    }
}