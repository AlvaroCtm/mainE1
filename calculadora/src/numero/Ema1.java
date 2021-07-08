package numero;

import java.util.Scanner;

public class Ema1 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		System.out.println("ingrese su Sueldo:... ");
		int A = numero.nextInt();
		int b = 40;
		int R= A+b;
		
		if(A<300) {
			System.out.println("Su bonificacion es de 40");
			System.out.println("Se agregado bonificacion con un total de: " +R);
			
		}else {
			System.out.println("Su bonificacion + 0 ");
			System.out.println("Se total es de:  " +A);
		}
		
	}
		

	}


