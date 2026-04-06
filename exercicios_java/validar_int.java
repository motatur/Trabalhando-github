import java.util.Scanner;
public class validar_int {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite o valor: ");
    

    if(sc.hasNextInt()) {
        int valor = sc.nextInt();
    System.out.println("Você digitou: " + valor);

     } else {
        System.out.println("Dado inválido");
        

}    
 sc.close();
}
}
