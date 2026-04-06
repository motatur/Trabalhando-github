import java.util.Scanner;

public class multa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual foi a velocidade atingida pelo veículo?:   ");
        double velocidade = sc.nextDouble();
        double excesso = velocidade - 80;
        double multa = excesso * 50;
        
        if (velocidade> 80.0){
            System.out.println("O limite de velocidade era de 80 km/h");
            System.out.printf("Valor da multa: R$ %.2f%n", multa);
            System.out.printf("E você excedeu : KM/h %.2f%n ",  + excesso);
            } else { 
                System.out.println("O Veículo não foi multado!");
            } 
            sc.close();
    }

}    



