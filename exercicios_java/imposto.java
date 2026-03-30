import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário (R$): ");
        double salario = sc.nextDouble();

        double inss = 0.0;
        double irrf = 0.0;

        // Cálculo do INSS (exemplo simplificado)
        if (salario <= 1320.00) {
            inss = salario * 0.075;
        } else if (salario <= 2571.29) {
            inss = salario * 0.09;
        } else if (salario <= 3856.94) {
            inss = salario * 0.12;
        } else {
            inss = salario * 0.14;
        }

        double salarioBase = salario - inss;

        // Cálculo do IRRF (exemplo simplificado)
        if (salarioBase <= 1903.98) {
            irrf = 0.0;
        } else if (salarioBase <= 2826.65) {
            irrf = salarioBase * 0.075;
        } else if (salarioBase <= 3751.05) {
            irrf = salarioBase * 0.15;
        } else if (salarioBase <= 4664.68) {
            irrf = salarioBase * 0.225;
        } else {
            irrf = salarioBase * 0.275;
        }

        double salarioLiquido = salario - inss - irrf;

        System.out.printf("INSS: R$ %.2f\n", inss);
        System.out.printf("IRRF: R$ %.2f\n", irrf);
        System.out.printf("Salário líquido: R$ %.2f\n", salarioLiquido);

        sc.close();
    }
}