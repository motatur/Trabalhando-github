import java.util.Scanner;
public class validar_str {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite o valor: ");
    String valor = sc.nextLine();

    if(valor.trim().isEmpty()) {
    System.out.println("Dado inválido!!");

     } else {
        System.out.println("Você digitou: " + valor);

}    
 sc.close();
}
}
