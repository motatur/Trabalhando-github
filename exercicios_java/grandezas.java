import java.util.Scanner;
public class grandezas {
    public static void main (String[]args){
         Scanner sc = new Scanner(System.in);
        System.out.println("******************************\n" + //
                        "CÁLCULO DE GRANDEZAS ELÉTRICAS\n");
        System.out.println("******************************");
        System.out.println("1. Tensão (em Volt)");
        System.out.println("2. Resistência (em Ohm)");
        System.out.println("3. Corrente (em Ampére)");
        System.out.println("4. Sair do programa");
        System.out.println("******************************");
        
        System.out.println("Qual grandeza deseja calcular?:  ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite a Resistência (em Ohm): ");
                double R1 = sc.nextDouble();

                 System.out.print("Digite a Corrente (em Ampére): ");

                double I1 = sc.nextDouble();

                double U = R1 * I1;

                System.out.println("Tensão (U) = " + U + " V");
                break;
            case 2:
                System.out.println("Digite a Tensão (em Volt): ");
                double U2 = sc.nextDouble();

                System.out.println("Digite a Corrente (em Ampére): ");
                double I2 = sc.nextDouble();
                if (I2 !=0) {
                    double R = U2 / I2;
                    System.out.print("Resistência (R) = " + R + "Ohm");
                } else { 
                    System.out.println("Erro, divisão por zero!");

                }
                break;
                case 3: 
                System.out.println("Digite a tensão em volt: ");
                double U3 = sc.nextDouble();

                System.out.println("Digite a Resistência (em Ohm):");
                double R3 = sc.nextDouble();

                if (R3 !=0) {
                    double I = U3 / R3;
                    System.out.print("Corrente (I) = " + I + "A");
                } else { 
                    System.out.println("Erro, divisão por zero!");

                }
                break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

            default:
               System.out.println("Opção inválida!");


               sc.close();
        }

      



        




        



    }    
}
