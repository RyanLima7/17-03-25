package src;

import java.util.Scanner;

public class ExWhileParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in); 
	 int numero;
	        while (true) { 
			System.out.println("Digite um número para eu verificar se ele é par ou ímpar: " );
			numero = sc.nextInt();
			
			 
				 if (numero == 0) {
					 break;
				 }
			            if (numero % 2 == 0) {
			            	System.out.println("O número " + numero + " é PAR.");
			        } else {
			            System.out.println("O número " + numero + " é ÍMPAR.");
			        }
				
                   
	}
			            sc.close();

	        
	}
}
