import java.util.Scanner;

public class reajuste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sal = sc.nextDouble();
        double perc;

        if (sal <= 1000) perc = 0.20;
        else if (sal <= 1700) perc = 0.15;
        else if (sal <= 2300) perc = 0.10;
        else perc = 0.05;

        double aumento = sal * perc;
        double novo = sal + aumento;

        System.out.println("Novo salário: " + novo);
    }
}
