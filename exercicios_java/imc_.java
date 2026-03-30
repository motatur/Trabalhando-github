import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu peso em KG: ");
		float peso = entrada.nextFloat();
		
		System.out.println("Digite a sua altura em metros (EX: 1.72): ");
		float altura = entrada.nextFloat();
		
		
		float imc = peso / (altura * altura);
		
		if (imc<=18.5) {
		    
		   System.out.println("Seu estado é: magreza"  + imc);
		   
		} 
		else if(imc<25) {
		
		System.out.println("Você tem o imc em estado normal!"  + imc);
		
	    }else if (imc<30){
	        
	        System.out.println("Seu estado é: Sobrepeso"  + imc);
	        
	        }else {
	            
	            System.out.printf("Seu estado é: Obesidade" + imc);
	        }
	    }

}

		

