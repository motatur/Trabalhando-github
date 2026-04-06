import java.util.Scanner;

public class viagens {
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Qual será a distãncia da sua viagem em km/h?:  ");
    double distancia = sc.nextDouble();
    double passagem;

    if(distancia<=200){
        passagem = distancia * 0.5;
    } else {
        passagem = distancia * 0.45;
    }

    System.out.printf("Olá, o preço de sua viagem ficou no valor de: R$ %.2f%n ", + passagem);
    

sc.close();


 }   
}
