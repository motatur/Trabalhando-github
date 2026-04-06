import java.util.Scanner;
public class maior_menor {
    
public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite o primeiro número: ");
    double num1 =  sc.nextDouble();




    System.out.println("Digite o segundo número: ");
    double num2 =  sc.nextDouble();

    System.out.println("Digite o terceiro número: ");
    double num3 =  sc.nextDouble();

    double maior = num1;
    if (num2>maior){
        maior = num2;
        }
    if (num3>maior){
        maior = num3;
    }
        
   //menor

    double menor = num1;
    if (num2<menor) {
        menor = num2;
    }
    if (num3<menor) {
        menor = num3;
        } 
       
        //soma e media

       double soma = num1 + num2 + num3;
       double media =   (num1 + num2 + num3) / 3;


       System.out.println("Dos numeros digitados, o maior é:  " + maior);
        System.out.println("Dos numeros digitados, o menor é:  " + menor );
        System.out.println("A soma dos números tem como resultado: " + soma);
        System.out.println("A média dos numeros tem como resultado:  " + media);
sc.close();
    }
    
}
    
            




