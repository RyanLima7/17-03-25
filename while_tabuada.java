package src;

import java.util.Scanner;

public class while_tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in); 
		
	int numero;
    System.out.print("Digite um número para ver sua tabuada: ");
    numero = sc.nextInt();
    int i = 1;

    do {
        System.out.println(numero + " x " + i + " = " + (numero * i));
        i++;
    } while (i <= 10);

    
	}

}
